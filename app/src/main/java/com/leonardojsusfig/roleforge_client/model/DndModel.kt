package com.leonardojsusfig.roleforge_client.model

data class DndModel(
    val count : Int,
    val result : List<CharList>
)

data class CharList(
    val id : String,
    val user : String,
    val name : String,
    val system : String,
    val sheetList : List<CharacterFile>
)

interface CharacterFile{
}

data class CharacterDnDFile(
    //Attributes i can't group
    val name : String,
    val inspiration : Boolean,
    val proficiency : Int,
    val passiveWisdom : Int,
    val proficienciesLanguages : Int,
    val personalityTraits : String,
    val personalityIdeals : String,
    val personalityBounds : String,
    val personalityFlaws : String,

    //Attributes related to life
    val armor : Int,
    val initiative : Int,
    val speed : Int,
    val maxHitPoints : Int,
    val currentHitPoints : Int,
    val temporaryHitPoints : Int,
    val hitDice : Int,
    val saveSuccesses : List<Boolean>,
    val saveFailures : List<Boolean>,
    val attacks : List<String>,

    //Attributes related to class
    val classType : String,
    val level : Int,
    val background : String,
    val playerName : String,
    val race : String,
    val alignment : String,
    val experiencePoints : Int,

    //Attributes related to stats
    val strength : Int,
    val strengthMod : Int,
    val dexterity : Int,
    val dexterityMod : Int,
    val constitution : Int,
    val constitutionMod : Int,
    val intelligence : Int,
    val intelligenceMod : Int,
    val wisdom : Int,
    val wisdomMod : Int,
    val charisma : Int,
    val charismaMod : Int,

    //Attributes related to skills
    val favorableSkill : List<String>,
    val acrobatics : Int,
    val animalHandling : Int,
    val arcana : Int,
    val athletics : Int,
    val deception : Int,
    val history : Int,
    val insight : Int,
    val intimidation : Int,
    val investigation : Int,
    val medicine : Int,
    val nature : Int,
    val perception : Int,
    val performance : Int,
    val persuasion : Int,
    val religion : Int,
    val sleightOfHand : Int,
    val stealth : Int,
    val survival : Int,

    //Attributes related to saving throws
    val favorableSaves : List<String>,
    val strengthSave : Int,
    val dexteritySave : Int,
    val constitutionSave : Int,
    val intelligenceSave : Int,
    val wisdomSave : Int,
    val charismaSave : Int,

    //Attributes related to equipment
    val backpack : List<String>,
    val equipmentCP : Int,
    val equipmentSP : Int,
    val equipmentEP : Int,
    val equipmentGP : Int,
    val equipmentPP : Int
) : CharacterFile

data class CharacterDndInfo(
    val name : String,
    val age : Int,
    val height : String,
    val weight : String,
    val eyes : String,
    val hair : String,
    val appearance : String,
    val backstory : String,
    val allies : String,
    val additionalFeatures : String,
    val treasure : String
) : CharacterFile

data class CharacterDndSpells(
    val classType : String,
    val ability : String,
    val saveDc : Int,
    val attackBonus : Int,
    val cantrips0 : List<String>,
    val spell1 : List<String>,
    val spell2 : List<String>,
    val spell3 : List<String>,
    val spell4 : List<String>,
    val spell5 : List<String>,
    val spell6 : List<String>,
    val spell7 : List<String>,
    val spell8 : List<String>,
    val spell9 : List<String>
) : CharacterFile