package com.example.musculation30days.data

import com.example.musculation30days.R
import com.example.musculation30days.ui.model.Tip

object DataSource {
    val tips = listOf(
        // List of class 
        Tip(1, 1, "Jour 1: Échauffement & Forme",
            "Apprendre les mouvements de base et l'importance de l'échauffement. 10min cardio + étirements dynamiques.",
            R.drawable.day1_warmup),

        Tip(2, 2, "Jour 2: Squat Corporel",
            "Maîtriser le squat sans poids. 4 séries de 15 répétitions. Garder le dos droit et descendre jusqu'à cuisses parallèles au sol.",
            R.drawable.day2_squat),

        Tip(3, 3, "Jour 3: Pompes Adaptées",
            "Pompes genoux ou mur selon niveau. 4 séries jusqu'à fatigue. Contracter les abdominaux.",
            R.drawable.day3_pushups),

        Tip(4, 4, "Jour 4: Gainage Abdominal",
            "Planche 3x45 secondes + crunch 3x20. Dos droit, respiration contrôlée.",
            R.drawable.day4_plank),

        Tip(5, 5, "Jour 5: Fentes Avant",
            "Fentes 3x12 par jambe. Genou arrière ne touche pas le sol, genou avant aligné avec cheville.",
            R.drawable.day5_lunges),

        Tip(6, 6, "Jour 6: Dos - Rowing Incliné",
            "Avec haltères légers. 4x12. Dos droit à 45°, omoplates serrées.",
            R.drawable.day6_rows),

        Tip(7, 7, "Jour 7: Récupération Active",
            "Étirements 20min + foam roller. Le repos est crucial pour la croissance musculaire.",
            R.drawable.day7_recovery),

        // SEMAINE 2 - HALTÈRES
        Tip(8, 8, "Jour 8: Développé Couché Haltères",
            "4 séries de 10 reps. Descendre lentement, exploser vers le haut. Poignets droits.",
            R.drawable.day8_benchpress),

        Tip(9, 9, "Jour 9: Soulevé de Terre",
            "3 séries de 8 reps. Dos PLAT, hanches basses, pousser avec les jambes.",
            R.drawable.day9_deadlift),

        Tip(10, 10, "Jour 10: Développé Épaules",
            "4x12 assis. Ne pas bloquer coudes en haut, contrôler la descente.",
            R.drawable.day10_shoulderpress),

        Tip(11, 11, "Jour 11: Tractions Assistées",
            "3 séries max reps. Si impossible, tractions négatives ou élastiques.",
            R.drawable.day11_pullups),

        Tip(12, 12, "Jour 12: Curl Biceps",
            "4x15 alterné. Coudes collés au corps, pas d'élan, contraction maximale.",
            R.drawable.day12_curls),

        Tip(13, 13, "Jour 13: Triceps Extension",
            "3x12 derrière la tête. Épaules immobiles, isoler le triceps.",
            R.drawable.day13_triceps),

        Tip(14, 14, "Jour 14: Jambes - Squat Charge",
            "4x10 avec barre ou haltères. Augmenter progressivement la charge.",
            R.drawable.day14_legpress),

        // SEMAINE 3 - INTENSIFICATION
        Tip(15, 15, "Jour 15: Mollets Débout",
            "5x20 élévations. Étirement complet en bas, contraction en haut.",
            R.drawable.day15_calfraises),

        Tip(16, 16, "Jour 16: Abdominaux Avancés",
            "Russian twist 3x20 + relevés de jambes 3x15. Contrôle total du mouvement.",
            R.drawable.day16_abs),

        Tip(17, 17, "Jour 17: Dos Largeur",
            "Pull-over 4x12 + tirage poitrine 4x10. Dos arqué, poitrine sortie.",
            R.drawable.day17_back),

        Tip(18, 18, "Jour 18: Pectoraux Profonds",
            "Écarté haltères 4x12 + dips 3xmax. Étirement pectoral en bas.",
            R.drawable.day18_chest),

        Tip(19, 19, "Jour 19: Épaules 3D",
            "Lateral raises 4x15 + frontal raises 4x12. Épaules rondes et définies.",
            R.drawable.day19_shoulders),

        Tip(20, 20, "Jour 20: Bras Complet",
            "Superset biceps/triceps 3 tours. Intensité élevée, récupération courte.",
            R.drawable.day20_arms),

        Tip(21, 21, "Jour 21: Jambes Lourdes",
            "Squat lourd 5x5 + fentes marchées 3x10. Jour le plus intense de la semaine.",
            R.drawable.day21_legs),

        // SEMAINE 4 - FINITION
        Tip(22, 22, "Jour 22: Full Body",
            "Circuit training complet. 3 rounds de 8 exercices sans repos.",
            R.drawable.day22_fullbody),

        Tip(23, 23, "Jour 23: Cardio Musculation",
            "HIIT 20min + corde à sauter. Brûlage graisses accéléré.",
            R.drawable.day23_cardio),

        Tip(24, 24, "Jour 24: Mobilité",
            "Yoga musculation 30min. Souplesse et récupération musculaire.",
            R.drawable.day24_flexibility),

        Tip(25, 25, "Jour 25: Nutrition Protéines",
            "1.8g protéine/kg de poids. Repas post-training dans l'heure.",
            R.drawable.day25_protein),

        Tip(26, 26, "Jour 26: Hydratation",
            "3L d'eau minimum. Éviter déshydratation qui limite la performance.",
            R.drawable.day26_hydration),

        Tip(27, 27, "Jour 27: Sommeil Récupérateur",
            "8h de sommeil minimum. Hormone de croissance maximale la nuit.",
            R.drawable.day27_sleep),

        Tip(28, 28, "Jour 28: Suppléments Utiles",
            "Whey protein, creatine, BCAA. Utilisation judicieuse et dosage.",
            R.drawable.day28_supplements),

        Tip(29, 29, "Jour 29: Mesure Progrès",
            "Photos avant/après, mesures, performances. Objectivité dans l'évolution.",
            R.drawable.day29_progress),

        Tip(30, 30, "Jour 30: Célébration & Futur",
            "Félicitations ! Évaluer les 30 jours et planifier la suite du programme.",
            R.drawable.day30_celebration)
    )
}
