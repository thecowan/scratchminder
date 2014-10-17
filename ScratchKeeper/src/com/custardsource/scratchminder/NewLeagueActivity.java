package com.custardsource.scratchminder;

import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.custardsource.scratchminder.AddPlayerActivity.CheckableImageListAdapter;

public class NewLeagueActivity extends Activity {
	public static final String LEAGUE_ID = "LEAGUE_ID";
	Lobby lobby;
	private int itemBackground;
	private League editing;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_league);
		lobby = ((GlobalState) getApplication()).getLobby();

		TypedArray a = obtainStyledAttributes(R.styleable.GalleryTheme);
		itemBackground = a.getResourceId(
				R.styleable.GalleryTheme_android_galleryItemBackground, 0);
		a.recycle();

		if (getIntent().hasExtra(LEAGUE_ID)) {
			editing = lobby.leagueById(getIntent().getLongExtra(LEAGUE_ID, 0));
			setTitle(R.string.edit_league);
		}

		final CheckableImageListAdapter<Avatar> imageAdapter = new CheckableImageListAdapter<Avatar>(
				this, Arrays.asList(Avatar.values())) {
			@Override
			protected long getIdForItem(Avatar item) {
				return item.ordinal();
			}

			@Override
			protected void populateView(View v, Avatar current) {
				ImageView i = (ImageView) v.findViewById(R.id.image);
				i.setAdjustViewBounds(true);
				TextView t = (TextView) v.findViewById(R.id.counter);

				i.setImageResource(current.drawable());
				t.setVisibility(View.INVISIBLE);
			}
		};
		final GridView gridView = (GridView) findViewById(R.id.gridPicture);
		gridView.setAdapter(imageAdapter);
		gridView.setSelector(itemBackground);
		gridView.setChoiceMode(GridView.CHOICE_MODE_SINGLE);
		gridView.setSelection(0);
		gridView.setItemChecked(0, true);

		((Button) findViewById(R.id.ok))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View view) {
						String description = ((EditText) findViewById(R.id.newLeagueName))
								.getText().toString();
						League l = editing;
						if (l == null) {
							l = lobby.addLeague(description);
						} else {
							l.setName(description);
						}
						Avatar avatar = imageAdapter.getItem(gridView
								.getCheckedItemPosition());
						l.setAvatar(avatar);

						if (editing == null) {
							Intent intent = new Intent(NewLeagueActivity.this,
									LeagueActivity.class);
							intent.putExtra(LeagueActivity.LEAGUE_ID, l.id());
							startActivity(intent);
						} else {
							Intent result = new Intent("foo");
							result.putExtra(LEAGUE_ID, l.id());
							setResult(Activity.RESULT_OK, result);
							finish();
						}

					}
				});

		if (editing != null) {
			((EditText) findViewById(R.id.newLeagueName)).setText(editing
					.name());
			int index = imageAdapter.indexOf(editing.getAvatar());
			gridView.setSelection(index);
			gridView.setItemChecked(index, true);
		}

	}
}
