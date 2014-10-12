package com.custardsource.scratchminder;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Map;

public enum Avatar {
	caveman(R.drawable.caveman),
	dino_blue(R.drawable.dino_blue),
	dino_green(R.drawable.dino_green),
	dino_orange(R.drawable.dino_orange),
	pterodactyl(R.drawable.pterodactyl),
	remember_the_milk(R.drawable.remember_the_milk),
	user_iconshock_tiny_monsters_monster1(
			R.drawable.user_iconshock_tiny_monsters_monster1),
	user_iconshock_tiny_monsters_monster2(
			R.drawable.user_iconshock_tiny_monsters_monster2),
	user_iconshock_tiny_monsters_monster3(
			R.drawable.user_iconshock_tiny_monsters_monster3),
	user_iconshock_tiny_monsters_monster5(
			R.drawable.user_iconshock_tiny_monsters_monster5),
	user_iconshock_tiny_monsters_monster4(
			R.drawable.user_iconshock_tiny_monsters_monster4),
	user_fasticon_creaturecutes_blue(
			R.drawable.user_fasticon_creaturecutes_blue),
	user_fasticon_creaturecutes_bluepants(
			R.drawable.user_fasticon_creaturecutes_bluepants),
	user_fasticon_creaturecutes_greenblue(
			R.drawable.user_fasticon_creaturecutes_greenblue),
	user_fasticon_creaturecutes_greenbluepants(
			R.drawable.user_fasticon_creaturecutes_greenbluepants),
	user_fasticon_creaturecutes_green(
			R.drawable.user_fasticon_creaturecutes_green),
	user_fasticon_creaturecutes_greenpants(
			R.drawable.user_fasticon_creaturecutes_greenpants),
	user_fasticon_creaturecutes_grape(
			R.drawable.user_fasticon_creaturecutes_grape),
	user_fasticon_creaturecutes_grapepants(
			R.drawable.user_fasticon_creaturecutes_grapepants),
	user_fasticon_creaturecutes_orange(
			R.drawable.user_fasticon_creaturecutes_orange),
	user_fasticon_creaturecutes_orangepants(
			R.drawable.user_fasticon_creaturecutes_orangepants),
	user_fasticon_creaturecutes_red(R.drawable.user_fasticon_creaturecutes_red),
	user_fasticon_creaturecutes_redpants(
			R.drawable.user_fasticon_creaturecutes_redpants),
	icon_iconka_buddy_airhostess(R.drawable.icon_iconka_buddy_airhostess),
	icon_iconka_buddy_alien(R.drawable.icon_iconka_buddy_alien),
	icon_iconka_buddy_alieness(R.drawable.icon_iconka_buddy_alieness),
	icon_iconka_buddy_angel(R.drawable.icon_iconka_buddy_angel),
	icon_iconka_buddy_aphrodite(R.drawable.icon_iconka_buddy_aphrodite),
	icon_iconka_buddy_astronaut(R.drawable.icon_iconka_buddy_astronaut),
	icon_iconka_buddy_canary(R.drawable.icon_iconka_buddy_canary),
	icon_iconka_buddy_captainess(R.drawable.icon_iconka_buddy_captainess),
	icon_iconka_buddy_catwoman(R.drawable.icon_iconka_buddy_catwoman),
	icon_iconka_buddy_contractor(R.drawable.icon_iconka_buddy_contractor),
	icon_iconka_buddy_dandy(R.drawable.icon_iconka_buddy_dandy),
	icon_iconka_buddy_devil(R.drawable.icon_iconka_buddy_devil),
	icon_iconka_buddy_doctor(R.drawable.icon_iconka_buddy_doctor),
	icon_iconka_buddy_fairy(R.drawable.icon_iconka_buddy_fairy),
	icon_iconka_buddy_gangster(R.drawable.icon_iconka_buddy_gangster),
	icon_iconka_buddy_king(R.drawable.icon_iconka_buddy_king),
	icon_iconka_buddy_maid(R.drawable.icon_iconka_buddy_maid),
	icon_iconka_buddy_nick(R.drawable.icon_iconka_buddy_nick),
	icon_iconka_buddy_ninja(R.drawable.icon_iconka_buddy_ninja),
	icon_iconka_buddy_nun(R.drawable.icon_iconka_buddy_nun),
	icon_iconka_buddy_nurse(R.drawable.icon_iconka_buddy_nurse),
	icon_iconka_buddy_officer(R.drawable.icon_iconka_buddy_officer),
	icon_iconka_buddy_priest(R.drawable.icon_iconka_buddy_priest),
	icon_iconka_buddy_queen(R.drawable.icon_iconka_buddy_queen),
	icon_iconka_buddy_robot(R.drawable.icon_iconka_buddy_robot),
	icon_iconka_buddy_robotess(R.drawable.icon_iconka_buddy_robotess),
	icon_iconka_buddy_sportsman(R.drawable.icon_iconka_buddy_sportsman),
	icon_iconka_buddy_teacher(R.drawable.icon_iconka_buddy_teacher),

	user_animal_berube_alligator(R.drawable.user_animal_berube_alligator),
	user_animal_berube_ant(R.drawable.user_animal_berube_ant),
	user_animal_berube_bat(R.drawable.user_animal_berube_bat),
	user_animal_berube_bear(R.drawable.user_animal_berube_bear),
	user_animal_berube_bee(R.drawable.user_animal_berube_bee),
	user_animal_berube_bird(R.drawable.user_animal_berube_bird),
	user_animal_berube_bull(R.drawable.user_animal_berube_bull),
	user_animal_berube_bulldog(R.drawable.user_animal_berube_bulldog),
	user_animal_berube_butterfly(R.drawable.user_animal_berube_butterfly),
	user_animal_berube_cat(R.drawable.user_animal_berube_cat),
	user_animal_berube_chicken(R.drawable.user_animal_berube_chicken),
	user_animal_berube_cow(R.drawable.user_animal_berube_cow),
	user_animal_berube_crab(R.drawable.user_animal_berube_crab),
	user_animal_berube_crocodile(R.drawable.user_animal_berube_crocodile),
	user_animal_berube_deer(R.drawable.user_animal_berube_deer),
	user_animal_berube_dog(R.drawable.user_animal_berube_dog),
	user_animal_berube_donkey(R.drawable.user_animal_berube_donkey),
	user_animal_berube_duck(R.drawable.user_animal_berube_duck),
	user_animal_berube_eagle(R.drawable.user_animal_berube_eagle),
	user_animal_berube_elephant(R.drawable.user_animal_berube_elephant),
	user_animal_berube_fish(R.drawable.user_animal_berube_fish),
	user_animal_berube_fox(R.drawable.user_animal_berube_fox),
	user_animal_berube_frog(R.drawable.user_animal_berube_frog),
	user_animal_berube_giraffe(R.drawable.user_animal_berube_giraffe),
	user_animal_berube_gorilla(R.drawable.user_animal_berube_gorilla),
	user_animal_berube_hippo(R.drawable.user_animal_berube_hippo),
	user_animal_berube_horse(R.drawable.user_animal_berube_horse),
	user_animal_berube_insect(R.drawable.user_animal_berube_insect),
	user_animal_berube_lion(R.drawable.user_animal_berube_lion),
	user_animal_berube_monkey(R.drawable.user_animal_berube_monkey),
	user_animal_berube_moose(R.drawable.user_animal_berube_moose),
	user_animal_berube_mouse(R.drawable.user_animal_berube_mouse),
	user_animal_berube_owl(R.drawable.user_animal_berube_owl),
	user_animal_berube_panda(R.drawable.user_animal_berube_panda),
	user_animal_berube_penguin(R.drawable.user_animal_berube_penguin),
	user_animal_berube_pig(R.drawable.user_animal_berube_pig),
	user_animal_berube_rabbit(R.drawable.user_animal_berube_rabbit),
	user_animal_berube_rhino(R.drawable.user_animal_berube_rhino),
	user_animal_berube_rooster(R.drawable.user_animal_berube_rooster),
	user_animal_berube_shark(R.drawable.user_animal_berube_shark),
	user_animal_berube_sheep(R.drawable.user_animal_berube_sheep),
	user_animal_berube_snake(R.drawable.user_animal_berube_snake),
	user_animal_berube_tiger(R.drawable.user_animal_berube_tiger),
	user_animal_berube_turkey(R.drawable.user_animal_berube_turkey),
	user_animal_berube_turtle(R.drawable.user_animal_berube_turtle),
	user_animal_berube_wolf(R.drawable.user_animal_berube_wolf),
	
	user_iconka_persons_elvis(R.drawable.user_iconka_persons_elvis),
	user_iconka_persons_holmes(R.drawable.user_iconka_persons_holmes),
	user_iconka_persons_monroe(R.drawable.user_iconka_persons_monroe),
	user_iconka_persons_potter(R.drawable.user_iconka_persons_potter),
	user_iconka_persons_serduchka(R.drawable.user_iconka_persons_serduchka),
	user_iconka_persons_terminator(R.drawable.user_iconka_persons_terminator),
	
	user_iconka_dress_it_assassin_avatar(R.drawable.user_iconka_dress_it_assassin_avatar),
	user_iconka_dress_it_attendant_avatar(R.drawable.user_iconka_dress_it_attendant_avatar),
	user_iconka_dress_it_commissar_avatar(R.drawable.user_iconka_dress_it_commissar_avatar),
	user_iconka_dress_it_dad_avatar(R.drawable.user_iconka_dress_it_dad_avatar),
	user_iconka_dress_it_designer_avatar(R.drawable.user_iconka_dress_it_designer_avatar),
	user_iconka_dress_it_diver_avatar(R.drawable.user_iconka_dress_it_diver_avatar),
	user_iconka_dress_it_engineer_avatar(R.drawable.user_iconka_dress_it_engineer_avatar),
	user_iconka_dress_it_fireman_avatar(R.drawable.user_iconka_dress_it_fireman_avatar),
	user_iconka_dress_it_gradfemale_avatar(R.drawable.user_iconka_dress_it_gradfemale_avatar),
	user_iconka_dress_it_gradmale_avatar(R.drawable.user_iconka_dress_it_gradmale_avatar),
	user_iconka_dress_it_mom_avatar(R.drawable.user_iconka_dress_it_mom_avatar),
	user_iconka_dress_it_nurse_avatar(R.drawable.user_iconka_dress_it_nurse_avatar),
	user_iconka_dress_it_sexy_avatar(R.drawable.user_iconka_dress_it_sexy_avatar),
	user_iconka_dress_it_soldier_avatar(R.drawable.user_iconka_dress_it_soldier_avatar),
	user_iconka_dress_it_v_avatar(R.drawable.user_iconka_dress_it_v_avatar),
	user_iconka_dress_it_witch_avatar(R.drawable.user_iconka_dress_it_witch_avatar),
	mattahan_buuf1_newer_looking_but_older_rocket(R.drawable.mattahan_buuf1_newer_looking_but_older_rocket),
	mattahan_buuf1_things_after_certain_things_sort_of_means_everything(R.drawable.mattahan_buuf1_things_after_certain_things_sort_of_means_everything),
	mattahan_buuf1_things_free_your_mind(R.drawable.mattahan_buuf1_things_free_your_mind),
	mattahan_buuf1_things_mcs_speed_out_like_bank_robbers_fleeing_the_scene_to_be_a_sole_survivor_dj_the_getaway_driver(R.drawable.mattahan_buuf1_things_mcs_speed_out_like_bank_robbers_fleeing_the_scene),
	mattahan_buuf1_things_the_venerable_yellow_alien(R.drawable.mattahan_buuf1_things_the_venerable_yellow_alien),
	mattahan_buuf1_things_tux_looks_worried(R.drawable.mattahan_buuf1_things_tux_looks_worried),
	mattahan_buuf1_yes_there_are_two_rocket_icons(R.drawable.mattahan_buuf1_yes_there_are_two_rocket_icons),
	mattahan_buuf2_horsie(R.drawable.mattahan_buuf2_horsie),
	mattahan_buuf2_400(R.drawable.mattahan_buuf2_400),
	mattahan_buuf2_dope_red_robot(R.drawable.mattahan_buuf2_dope_red_robot),
	mattahan_buuf2_fauna_another_bear(R.drawable.mattahan_buuf2_fauna_another_bear),
	mattahan_buuf2_fauna_awesome_rhino(R.drawable.mattahan_buuf2_fauna_awesome_rhino),
	mattahan_buuf2_fauna_badass_angel_rat(R.drawable.mattahan_buuf2_fauna_badass_angel_rat),
	mattahan_buuf2_fauna_bebbe_the_boxbear(R.drawable.mattahan_buuf2_fauna_bebbe_the_boxbear),
	mattahan_buuf2_fauna_brian_the_noseless_lion(R.drawable.mattahan_buuf2_fauna_brian_the_noseless_lion),
	mattahan_buuf2_fauna_catdog(R.drawable.mattahan_buuf2_fauna_catdog),
	mattahan_buuf2_fauna_cow(R.drawable.mattahan_buuf2_fauna_cow),
	mattahan_buuf2_fauna_cute_little_low_res_chicken(R.drawable.mattahan_buuf2_fauna_cute_little_low_res_chicken),
	mattahan_buuf2_fauna_dragon(R.drawable.mattahan_buuf2_fauna_dragon),
	mattahan_buuf2_fauna_firefox_3(R.drawable.mattahan_buuf2_fauna_firefox_3),
	mattahan_buuf2_fauna_flambouyant_bird(R.drawable.mattahan_buuf2_fauna_flambouyant_bird),
	mattahan_buuf2_fauna_happy_coked_up_bear(R.drawable.mattahan_buuf2_fauna_happy_coked_up_bear),
	mattahan_buuf2_fauna_i_love_it_when_sue_calls(R.drawable.mattahan_buuf2_fauna_i_love_it_when_sue_calls),
	mattahan_buuf2_fauna_kitty(R.drawable.mattahan_buuf2_fauna_kitty),
	mattahan_buuf2_fauna_kitty_head(R.drawable.mattahan_buuf2_fauna_kitty_head),
	mattahan_buuf2_fauna_kraglar(R.drawable.mattahan_buuf2_fauna_kraglar),
	mattahan_buuf2_fauna_largak(R.drawable.mattahan_buuf2_fauna_largak),
	mattahan_buuf2_fauna_larrison_exantus(R.drawable.mattahan_buuf2_fauna_larrison_exantus),
	mattahan_buuf2_fauna_magical_bear_of_awesomeditude(R.drawable.mattahan_buuf2_fauna_magical_bear_of_awesomeditude),
	mattahan_buuf2_fauna_magical_purple_elephant(R.drawable.mattahan_buuf2_fauna_magical_purple_elephant),
	mattahan_buuf2_fauna_mantis_guy(R.drawable.mattahan_buuf2_fauna_mantis_guy),
	mattahan_buuf2_fauna_mark_the_rat(R.drawable.mattahan_buuf2_fauna_mark_the_rat),
	mattahan_buuf2_fauna_megaduck(R.drawable.mattahan_buuf2_fauna_megaduck),
	mattahan_buuf2_fauna_moe_the_depressed_amoeba(R.drawable.mattahan_buuf2_fauna_moe_the_depressed_amoeba),
	mattahan_buuf2_fauna_mos_duck(R.drawable.mattahan_buuf2_fauna_mos_duck),
	mattahan_buuf2_fauna_mr_buddha(R.drawable.mattahan_buuf2_fauna_mr_buddha),
	mattahan_buuf2_fauna_other_fish(R.drawable.mattahan_buuf2_fauna_other_fish),
	mattahan_buuf2_fauna_piggu_chan(R.drawable.mattahan_buuf2_fauna_piggu_chan),
	mattahan_buuf2_fauna_puppy(R.drawable.mattahan_buuf2_fauna_puppy),
	mattahan_buuf2_fauna_quasimoto_the_unseen_infant_form(R.drawable.mattahan_buuf2_fauna_quasimoto_the_unseen_infant_form),
	mattahan_buuf2_fauna_remy_the_anthropomorphic_pebble(R.drawable.mattahan_buuf2_fauna_remy_the_anthropomorphic_pebble),
	mattahan_buuf2_fauna_sean(R.drawable.mattahan_buuf2_fauna_sean),
	mattahan_buuf2_fauna_snizake(R.drawable.mattahan_buuf2_fauna_snizake),
	mattahan_buuf2_fauna_sven_the_kitten(R.drawable.mattahan_buuf2_fauna_sven_the_kitten),
	mattahan_buuf2_fauna_the_pressure_on_my_eyes_was_indescribable(R.drawable.mattahan_buuf2_fauna_the_pressure_on_my_eyes_was_indescribable),
	mattahan_buuf2_fauna_thing(R.drawable.mattahan_buuf2_fauna_thing),
	mattahan_buuf2_fauna_twitterific_will_kill_you(R.drawable.mattahan_buuf2_fauna_twitterific_will_kill_you),
	mattahan_buuf2_fauna_whizale(R.drawable.mattahan_buuf2_fauna_whizale),
	mattahan_buuf1_things_foods_acorn(R.drawable.mattahan_buuf1_things_foods_acorn),
	mattahan_buuf1_things_foods_apple(R.drawable.mattahan_buuf1_things_foods_apple),
	mattahan_buuf1_things_foods_bagel(R.drawable.mattahan_buuf1_things_foods_bagel),
	mattahan_buuf1_things_foods_cashew(R.drawable.mattahan_buuf1_things_foods_cashew),
	mattahan_buuf1_things_foods_dragon_egg(R.drawable.mattahan_buuf1_things_foods_dragon_egg),
	mattahan_buuf1_things_foods_fried_chicken_fetus(R.drawable.mattahan_buuf1_things_foods_fried_chicken_fetus),
	mattahan_buuf1_things_foods_hand_me_down_cup(R.drawable.mattahan_buuf1_things_foods_hand_me_down_cup),
	mattahan_buuf1_things_foods_hot_dog(R.drawable.mattahan_buuf1_things_foods_hot_dog),
	mattahan_buuf1_things_foods_i_m_lactose_intolerant_i_don_t_like_lactose_and_i_won_t_stand_for_it(R.drawable.mattahan_buuf1_things_foods_i_m_lactose_intolerant_i_don_t_like_lactose_and_i_won_t_stand_for_it),
	mattahan_buuf1_things_foods_look_out_joe_frank_ejaculated(R.drawable.mattahan_buuf1_things_foods_look_out_joe_frank_ejaculated),
	mattahan_buuf1_things_foods_mushroom(R.drawable.mattahan_buuf1_things_foods_mushroom),
	mattahan_buuf1_things_foods_old_but_not_stale_bread(R.drawable.mattahan_buuf1_things_foods_old_but_not_stale_bread),
	mattahan_buuf1_things_foods_sandwich(R.drawable.mattahan_buuf1_things_foods_sandwich),
	mattahan_buuf1_things_foods_some_kind_of_mexican_bottle(R.drawable.mattahan_buuf1_things_foods_some_kind_of_mexican_bottle),
	mattahan_buuf1_things_foods_swiss_cheese(R.drawable.mattahan_buuf1_things_foods_swiss_cheese),
	mattahan_buuf1_things_foods_they_mostly_come_at_night_mostly(R.drawable.mattahan_buuf1_things_foods_they_mostly_come_at_night_mostly),
	mattahan_buuf1_things_foods_tiny_condement_cup(R.drawable.mattahan_buuf1_things_foods_tiny_condement_cup),
	mattahan_buuf1_things_foods_well_this_is_one_for_the_books_huh_jerry(R.drawable.mattahan_buuf1_things_foods_well_this_is_one_for_the_books_huh_jerry),
	mattahan_buuf2_fizood_banana(R.drawable.mattahan_buuf2_fizood_banana),
	mattahan_buuf2_fizood_biscuit(R.drawable.mattahan_buuf2_fizood_biscuit),
	mattahan_buuf2_fizood_candy_biscuit(R.drawable.mattahan_buuf2_fizood_candy_biscuit),
	mattahan_buuf2_fizood_carrot(R.drawable.mattahan_buuf2_fizood_carrot),
	mattahan_buuf2_fizood_chocalate_chip_cookie(R.drawable.mattahan_buuf2_fizood_chocalate_chip_cookie),
	mattahan_buuf2_fizood_cup(R.drawable.mattahan_buuf2_fizood_cup),
	mattahan_buuf2_fizood_distractingly_red_heart_shaped_candy(R.drawable.mattahan_buuf2_fizood_distractingly_red_heart_shaped_candy),
	mattahan_buuf2_fizood_double_fudge_white_chocolate(R.drawable.mattahan_buuf2_fizood_double_fudge_white_chocolate),
	mattahan_buuf2_fizood_dumpling(R.drawable.mattahan_buuf2_fizood_dumpling),
	mattahan_buuf2_fizood_fried_plantain(R.drawable.mattahan_buuf2_fizood_fried_plantain),
	mattahan_buuf2_fizood_fries(R.drawable.mattahan_buuf2_fizood_fries),
	mattahan_buuf2_fizood_got_more_soul_than_a_sock_with_a_hole(R.drawable.mattahan_buuf2_fizood_got_more_soul_than_a_sock_with_a_hole),
	mattahan_buuf2_fizood_let_s_hope_ron_paul_doesn_t_get_assasinated_soon_after_inauguration(R.drawable.mattahan_buuf2_fizood_let_s_hope_ron_paul_doesn_t_get_assasinated_soon_after_inauguration),
	mattahan_buuf2_fizood_lupe_fiasco_has_revealed_himself_to_be_kind_of_a_douche(R.drawable.mattahan_buuf2_fizood_lupe_fiasco_has_revealed_himself_to_be_kind_of_a_douche),
	mattahan_buuf2_fizood_omar_the_evil_garlic_clove(R.drawable.mattahan_buuf2_fizood_omar_the_evil_garlic_clove),
	mattahan_buuf2_fizood_pancakes(R.drawable.mattahan_buuf2_fizood_pancakes),
	mattahan_buuf2_fizood_scone(R.drawable.mattahan_buuf2_fizood_scone),
	mattahan_buuf2_fizood_small_somewhat_gummy_candy(R.drawable.mattahan_buuf2_fizood_small_somewhat_gummy_candy),
	mattahan_buuf2_fizood_strawbizerry(R.drawable.mattahan_buuf2_fizood_strawbizerry),
	mattahan_buuf2_sentient_evil_genius(R.drawable.mattahan_buuf2_sentient_evil_genius),
	mattahan_buuf2_sentient_homer(R.drawable.mattahan_buuf2_sentient_homer),
	mattahan_buuf2_sentient_ill_new_robot(R.drawable.mattahan_buuf2_sentient_ill_new_robot),
	mattahan_buuf2_sentient_jlp_robot(R.drawable.mattahan_buuf2_sentient_jlp_robot),
	mattahan_buuf2_sentient_monkey_suite_anxiously_awaitin_new_madvillain_material(R.drawable.mattahan_buuf2_sentient_monkey_suite_anxiously_awaitin_new_madvillain_material),
	mattahan_buuf2_sentient_mysterious_guy(R.drawable.mattahan_buuf2_sentient_mysterious_guy),
	mattahan_buuf2_sentient_ninja(R.drawable.mattahan_buuf2_sentient_ninja),
	mattahan_buuf2_sentient_old_lady(R.drawable.mattahan_buuf2_sentient_old_lady),
	mattahan_buuf2_sentient_ood(R.drawable.mattahan_buuf2_sentient_ood),
	mattahan_buuf2_sentient_robo_snake_skull_god(R.drawable.mattahan_buuf2_sentient_robo_snake_skull_god),
	mattahan_buuf2_sentient_tashawn(R.drawable.mattahan_buuf2_sentient_tashawn),
	mattahan_buuf2_sentient_viking(R.drawable.mattahan_buuf2_sentient_viking),
	mattahan_buuf2_sentient_weird_blue_beard_guy(R.drawable.mattahan_buuf2_sentient_weird_blue_beard_guy),
	mattahan_buuf2_sentient_woodbot(R.drawable.mattahan_buuf2_sentient_woodbot),
	mattahan_buuf2_super_1_soul_brother(R.drawable.mattahan_buuf2_super_1_soul_brother),
	mattahan_buuf2_super_3_sucked(R.drawable.mattahan_buuf2_super_3_sucked),
	mattahan_buuf2_super_barret(R.drawable.mattahan_buuf2_super_barret),
	mattahan_buuf2_super_bruce(R.drawable.mattahan_buuf2_super_bruce),
	mattahan_buuf2_super_civil_war_spiderman(R.drawable.mattahan_buuf2_super_civil_war_spiderman),
	mattahan_buuf2_super_cloud(R.drawable.mattahan_buuf2_super_cloud),
	mattahan_buuf2_super_cyberman(R.drawable.mattahan_buuf2_super_cyberman),
	mattahan_buuf2_super_deadpool(R.drawable.mattahan_buuf2_super_deadpool),
	mattahan_buuf2_super_grimm(R.drawable.mattahan_buuf2_super_grimm),
	mattahan_buuf2_super_hulk(R.drawable.mattahan_buuf2_super_hulk),
	mattahan_buuf2_super_hulk_busta(R.drawable.mattahan_buuf2_super_hulk_busta),
	mattahan_buuf2_super_hulkbusta2(R.drawable.mattahan_buuf2_super_hulkbusta2),
	mattahan_buuf2_super_ironcyberman(R.drawable.mattahan_buuf2_super_ironcyberman),
	mattahan_buuf2_super_ironman(R.drawable.mattahan_buuf2_super_ironman),
	mattahan_buuf2_super_lila(R.drawable.mattahan_buuf2_super_lila),
	mattahan_buuf2_super_mf_doom(R.drawable.mattahan_buuf2_super_mf_doom),
	mattahan_buuf2_super_t_challa(R.drawable.mattahan_buuf2_super_t_challa),
	mattahan_buuf2_super_white_ninja(R.drawable.mattahan_buuf2_super_white_ninja),
	mattahan_microgant_giant_worms(R.drawable.mattahan_microgant_giant_worms),
	mattahan_microgant_mastermind(R.drawable.mattahan_microgant_mastermind),
	/*
	mattahan_microgant_shapes_black_cylinder(R.drawable.mattahan_microgant_shapes_black_cylinder),
	mattahan_microgant_shapes_blue_cylinder(R.drawable.mattahan_microgant_shapes_blue_cylinder),
	mattahan_microgant_shapes_blue_sphere(R.drawable.mattahan_microgant_shapes_blue_sphere),
	mattahan_microgant_shapes_brown_sphere(R.drawable.mattahan_microgant_shapes_brown_sphere),
	mattahan_microgant_shapes_cube_of_envy(R.drawable.mattahan_microgant_shapes_cube_of_envy),
	mattahan_microgant_shapes_cube_of_non_violence(R.drawable.mattahan_microgant_shapes_cube_of_non_violence),
	mattahan_microgant_shapes_green_cylinder(R.drawable.mattahan_microgant_shapes_green_cylinder),
	mattahan_microgant_shapes_green_sphere(R.drawable.mattahan_microgant_shapes_green_sphere),
	mattahan_microgant_shapes_hot_cube(R.drawable.mattahan_microgant_shapes_hot_cube),
	mattahan_microgant_shapes_purple_cube_kind_of_like_an_abstract_gamecube(R.drawable.mattahan_microgant_shapes_purple_cube_kind_of_like_an_abstract_gamecube),
	mattahan_microgant_shapes_purple_cylinder(R.drawable.mattahan_microgant_shapes_purple_cylinder),
	mattahan_microgant_shapes_purple_sphere(R.drawable.mattahan_microgant_shapes_purple_sphere),
	mattahan_microgant_shapes_red_cylinder(R.drawable.mattahan_microgant_shapes_red_cylinder),
	mattahan_microgant_shapes_red_sphere(R.drawable.mattahan_microgant_shapes_red_sphere),
	mattahan_microgant_shapes_rys_random_yellow_sphere_nothing_like_some_good_ol_fashioned_acronyms(R.drawable.mattahan_microgant_shapes_rys_random_yellow_sphere_nothing_like_some_good_ol_fashioned_acronyms),
	mattahan_microgant_shapes_white_cylinder_of_non_blackness(R.drawable.mattahan_microgant_shapes_white_cylinder_of_non_blackness),
	mattahan_microgant_shapes_white_sphere(R.drawable.mattahan_microgant_shapes_white_sphere),
	*/
	mattahan_minigant_moe(R.drawable.mattahan_minigant_moe),
	mattahan_osmu_atzuatlplafle(R.drawable.mattahan_osmu_atzuatlplafle),
	mattahan_osmu_bleh(R.drawable.mattahan_osmu_bleh),
	mattahan_osmu_damion(R.drawable.mattahan_osmu_damion),
	mattahan_osmu_netzero_used_to_be_free(R.drawable.mattahan_osmu_netzero_used_to_be_free),
	mattahan_osmu_oc(R.drawable.mattahan_osmu_oc),
	mattahan_osmu_pink_eye(R.drawable.mattahan_osmu_pink_eye),
	mattahan_osmu_prupletzulkwatl(R.drawable.mattahan_osmu_prupletzulkwatl),
	mattahan_osmu_ridumenweap(R.drawable.mattahan_osmu_ridumenweap),
	mattahan_superbuuf_catdog(R.drawable.mattahan_superbuuf_catdog),
	mattahan_superbuuf_cyberman(R.drawable.mattahan_superbuuf_cyberman),
	mattahan_superbuuf_ghostface_blackred_ironman(R.drawable.mattahan_superbuuf_ghostface_blackred_ironman),
	mattahan_superbuuf_ghostface_gold(R.drawable.mattahan_superbuuf_ghostface_gold),
	mattahan_superbuuf_ghostface_ironman(R.drawable.mattahan_superbuuf_ghostface_ironman),
	mattahan_superbuuf_ghostface_prototype_suit(R.drawable.mattahan_superbuuf_ghostface_prototype_suit),
	mattahan_superbuuf_ghostface_silv(R.drawable.mattahan_superbuuf_ghostface_silv),
	mattahan_superbuuf_ghostface_stealth_iron_man(R.drawable.mattahan_superbuuf_ghostface_stealth_iron_man),
	mattahan_superbuuf_kitty(R.drawable.mattahan_superbuuf_kitty),
	mattahan_superbuuf_kitty_head(R.drawable.mattahan_superbuuf_kitty_head),
	mattahan_superbuuf_ood(R.drawable.mattahan_superbuuf_ood),
	mattahan_superbuuf_steve_rogers(R.drawable.mattahan_superbuuf_steve_rogers),
	mattahan_superbuuf_superman_s(R.drawable.mattahan_superbuuf_superman_s),
	mattahan_superbuuf_tardis(R.drawable.mattahan_superbuuf_tardis),
	mattahan_superbuuf_vader(R.drawable.mattahan_superbuuf_vader),
	mattahan_ultrabuuf_a_young_leo(R.drawable.mattahan_ultrabuuf_a_young_leo),
	mattahan_ultrabuuf_akuma(R.drawable.mattahan_ultrabuuf_akuma),
	mattahan_ultrabuuf_balrog(R.drawable.mattahan_ultrabuuf_balrog),
	mattahan_ultrabuuf_barret(R.drawable.mattahan_ultrabuuf_barret),
	mattahan_ultrabuuf_blanka(R.drawable.mattahan_ultrabuuf_blanka),
	mattahan_ultrabuuf_chun_li(R.drawable.mattahan_ultrabuuf_chun_li),
	mattahan_ultrabuuf_cloud(R.drawable.mattahan_ultrabuuf_cloud),
	mattahan_ultrabuuf_dhalsim(R.drawable.mattahan_ultrabuuf_dhalsim),
	mattahan_ultrabuuf_ken(R.drawable.mattahan_ultrabuuf_ken),
	mattahan_ultrabuuf_makoto(R.drawable.mattahan_ultrabuuf_makoto),
	mattahan_ultrabuuf_my_plot_proliferates(R.drawable.mattahan_ultrabuuf_my_plot_proliferates),
	mattahan_ultrabuuf_ryu(R.drawable.mattahan_ultrabuuf_ryu),
	mattahan_ultrabuuf_sakura(R.drawable.mattahan_ultrabuuf_sakura),
	mattahan_ultrabuuf_zangief(R.drawable.mattahan_ultrabuuf_zangief),
	mattahan_ultrabuuf_things_badgb(R.drawable.mattahan_ultrabuuf_things_badgb),
	mattahan_ultrabuuf_things_cylon_ship(R.drawable.mattahan_ultrabuuf_things_cylon_ship),
	
	mattahan_ultrabuuf_comics_23_1(R.drawable.mattahan_ultrabuuf_comics_23_1),
	mattahan_ultrabuuf_comics_batman2(R.drawable.mattahan_ultrabuuf_comics_batman2),
	mattahan_ultrabuuf_comics_benny_boy(R.drawable.mattahan_ultrabuuf_comics_benny_boy),
	mattahan_ultrabuuf_comics_beyond_basic_basement_flood_with_napalm(R.drawable.mattahan_ultrabuuf_comics_beyond_basic_basement_flood_with_napalm),
	mattahan_ultrabuuf_comics_burn_ignorant_creature(R.drawable.mattahan_ultrabuuf_comics_burn_ignorant_creature),
	mattahan_ultrabuuf_comics_capo(R.drawable.mattahan_ultrabuuf_comics_capo),
	mattahan_ultrabuuf_comics_captain_universe(R.drawable.mattahan_ultrabuuf_comics_captain_universe),
	mattahan_ultrabuuf_comics_colossus(R.drawable.mattahan_ultrabuuf_comics_colossus),
	mattahan_ultrabuuf_comics_flying_iron_man(R.drawable.mattahan_ultrabuuf_comics_flying_iron_man),
	mattahan_ultrabuuf_comics_happy_hulk(R.drawable.mattahan_ultrabuuf_comics_happy_hulk),
	mattahan_ultrabuuf_comics_hellboy(R.drawable.mattahan_ultrabuuf_comics_hellboy),
	mattahan_ultrabuuf_comics_hulkfist(R.drawable.mattahan_ultrabuuf_comics_hulkfist),
	mattahan_ultrabuuf_comics_iron_patriot(R.drawable.mattahan_ultrabuuf_comics_iron_patriot),
	mattahan_ultrabuuf_comics_ironman_hand(R.drawable.mattahan_ultrabuuf_comics_ironman_hand),
	mattahan_ultrabuuf_comics_james_bond_beamers(R.drawable.mattahan_ultrabuuf_comics_james_bond_beamers),
	mattahan_ultrabuuf_comics_johny_blaze(R.drawable.mattahan_ultrabuuf_comics_johny_blaze),
	mattahan_ultrabuuf_comics_lantern(R.drawable.mattahan_ultrabuuf_comics_lantern),
	mattahan_ultrabuuf_comics_logan(R.drawable.mattahan_ultrabuuf_comics_logan),
	mattahan_ultrabuuf_comics_magneto(R.drawable.mattahan_ultrabuuf_comics_magneto),
	mattahan_ultrabuuf_comics_method_man(R.drawable.mattahan_ultrabuuf_comics_method_man),
	mattahan_ultrabuuf_comics_monger(R.drawable.mattahan_ultrabuuf_comics_monger),
	mattahan_ultrabuuf_comics_morales(R.drawable.mattahan_ultrabuuf_comics_morales),
	mattahan_ultrabuuf_comics_more_23(R.drawable.mattahan_ultrabuuf_comics_more_23),
	mattahan_ultrabuuf_comics_more_a(R.drawable.mattahan_ultrabuuf_comics_more_a),
	mattahan_ultrabuuf_comics_more_black_spidey(R.drawable.mattahan_ultrabuuf_comics_more_black_spidey),
	mattahan_ultrabuuf_comics_more_bumble_starks(R.drawable.mattahan_ultrabuuf_comics_more_bumble_starks),
	mattahan_ultrabuuf_comics_more_cap_shield(R.drawable.mattahan_ultrabuuf_comics_more_cap_shield),
	mattahan_ultrabuuf_comics_more_golrediron(R.drawable.mattahan_ultrabuuf_comics_more_golrediron),
	mattahan_ultrabuuf_comics_more_hulkling(R.drawable.mattahan_ultrabuuf_comics_more_hulkling),
	mattahan_ultrabuuf_comics_more_iron_america(R.drawable.mattahan_ultrabuuf_comics_more_iron_america),
	mattahan_ultrabuuf_comics_more_maghulk(R.drawable.mattahan_ultrabuuf_comics_more_maghulk),
	mattahan_ultrabuuf_comics_more_shadowcat(R.drawable.mattahan_ultrabuuf_comics_more_shadowcat),
	mattahan_ultrabuuf_comics_more_shield(R.drawable.mattahan_ultrabuuf_comics_more_shield),
	mattahan_ultrabuuf_comics_more_the_canada_one(R.drawable.mattahan_ultrabuuf_comics_more_the_canada_one),
	mattahan_ultrabuuf_comics_more_war_machine(R.drawable.mattahan_ultrabuuf_comics_more_war_machine),
	mattahan_ultrabuuf_comics_more_x(R.drawable.mattahan_ultrabuuf_comics_more_x),
	mattahan_ultrabuuf_comics_older_kal_el(R.drawable.mattahan_ultrabuuf_comics_older_kal_el),
	mattahan_ultrabuuf_comics_pop_champagne(R.drawable.mattahan_ultrabuuf_comics_pop_champagne),
	mattahan_ultrabuuf_comics_red_chin_iron_man(R.drawable.mattahan_ultrabuuf_comics_red_chin_iron_man),
	mattahan_ultrabuuf_comics_rulk(R.drawable.mattahan_ultrabuuf_comics_rulk),
	mattahan_ultrabuuf_comics_rulkfist(R.drawable.mattahan_ultrabuuf_comics_rulkfist),
	mattahan_ultrabuuf_comics_serious(R.drawable.mattahan_ultrabuuf_comics_serious),
	mattahan_ultrabuuf_comics_silver_surfer(R.drawable.mattahan_ultrabuuf_comics_silver_surfer),
	mattahan_ultrabuuf_comics_spider_woman(R.drawable.mattahan_ultrabuuf_comics_spider_woman),
	mattahan_ultrabuuf_comics_spidey_can_t_stand_vilains(R.drawable.mattahan_ultrabuuf_comics_spidey_can_t_stand_vilains),
	mattahan_ultrabuuf_comics_sulking_hulkling(R.drawable.mattahan_ultrabuuf_comics_sulking_hulkling),
	mattahan_ultrabuuf_comics_thor(R.drawable.mattahan_ultrabuuf_comics_thor),
	mattahan_ultrabuuf_comics_vision(R.drawable.mattahan_ultrabuuf_comics_vision),
	mattahan_ultrabuuf_comics_wariron(R.drawable.mattahan_ultrabuuf_comics_wariron),
	mattahan_ultrabuuf_comics_we_aite(R.drawable.mattahan_ultrabuuf_comics_we_aite),

	mattahan_ultrabuuf_tv_and_movies_captain_adama_smiling_for_some_reason(R.drawable.mattahan_ultrabuuf_tv_and_movies_captain_adama_smiling_for_some_reason),
	mattahan_ultrabuuf_tv_and_movies_dr(R.drawable.mattahan_ultrabuuf_tv_and_movies_dr),
	mattahan_ultrabuuf_tv_and_movies_gordon_tremeshco(R.drawable.mattahan_ultrabuuf_tv_and_movies_gordon_tremeshco),
	mattahan_ultrabuuf_tv_and_movies_johny_cash(R.drawable.mattahan_ultrabuuf_tv_and_movies_johny_cash),
	mattahan_ultrabuuf_tv_and_movies_kitty(R.drawable.mattahan_ultrabuuf_tv_and_movies_kitty),
	mattahan_ultrabuuf_tv_and_movies_newtigallo(R.drawable.mattahan_ultrabuuf_tv_and_movies_newtigallo),
	mattahan_ultrabuuf_tv_and_movies_ood(R.drawable.mattahan_ultrabuuf_tv_and_movies_ood),
	mattahan_ultrabuuf_tv_and_movies_pete_hornberger(R.drawable.mattahan_ultrabuuf_tv_and_movies_pete_hornberger),
	mattahan_ultrabuuf_tv_and_movies_smith(R.drawable.mattahan_ultrabuuf_tv_and_movies_smith),
	mattahan_ultrabuuf_tv_and_movies_snake_eyes(R.drawable.mattahan_ultrabuuf_tv_and_movies_snake_eyes),
	mattahan_ultrabuuf_tv_and_movies_we_need_to_talk_son(R.drawable.mattahan_ultrabuuf_tv_and_movies_we_need_to_talk_son),
	mattahan_ultrabuuf_tv_and_movies_woody(R.drawable.mattahan_ultrabuuf_tv_and_movies_woody),
	
	;
	
	
	@SuppressLint("UseSparseArrays")
	private static final Map<Integer, Avatar> BY_DRAWABLE_IDS = new HashMap<Integer, Avatar>();
	static {
		for (Avatar avatar : Avatar.values()) {
			BY_DRAWABLE_IDS.put(avatar.drawableId, avatar);
		}
	}

	private int drawableId;

	Avatar(int drawableId) {
		this.drawableId = drawableId;

	}

	public int drawable() {
		return drawableId;
	}
}
