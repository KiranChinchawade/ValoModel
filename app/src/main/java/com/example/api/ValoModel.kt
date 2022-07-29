package com.example.api


import com.google.gson.annotations.SerializedName


data class Data (

    @SerializedName("uuid"                      ) var uuid                      : String?              = null,
    @SerializedName("displayName"               ) var displayName               : String?              = null,
    @SerializedName("description"               ) var description               : String?              = null,
    @SerializedName("developerName"             ) var developerName             : String?              = null,
    @SerializedName("characterTags"             ) var characterTags             : String?              = null,
    @SerializedName("displayIcon"               ) var displayIcon               : String?              = null,
    @SerializedName("displayIconSmall"          ) var displayIconSmall          : String?              = null,
    @SerializedName("bustPortrait"              ) var bustPortrait              : String?              = null,
    @SerializedName("fullPortrait"              ) var fullPortrait              : String?              = null,
    @SerializedName("fullPortraitV2"            ) var fullPortraitV2            : String?              = null,
    @SerializedName("killfeedPortrait"          ) var killfeedPortrait          : String?              = null,
    @SerializedName("background"                ) var background                : String?              = null,
    @SerializedName("backgroundGradientColors"  ) var backgroundGradientColors  : ArrayList<String>    = arrayListOf(),
    @SerializedName("assetPath"                 ) var assetPath                 : String?              = null,
    @SerializedName("isFullPortraitRightFacing" ) var isFullPortraitRightFacing : Boolean?             = null,
    @SerializedName("isPlayableCharacter"       ) var isPlayableCharacter       : Boolean?             = null,
    @SerializedName("isAvailableForTest"        ) var isAvailableForTest        : Boolean?             = null,
    @SerializedName("isBaseContent"             ) var isBaseContent             : Boolean?             = null,
    @SerializedName("role"                      ) var role                      : Role?                = Role(),
    @SerializedName("abilities"                 ) var abilities                 : ArrayList<Abilities> = arrayListOf(),
    @SerializedName("voiceLine"                 ) var voiceLine                 : VoiceLine?           = VoiceLine()

)



data class ValoModel (

    @SerializedName("status" ) var status : Int?            = null,
    @SerializedName("data"   ) var data   : ArrayList<Data> = arrayListOf()

)



data class Role (

    @SerializedName("uuid"        ) var uuid        : String? = null,
    @SerializedName("displayName" ) var displayName : String? = null,
    @SerializedName("description" ) var description : String? = null,
    @SerializedName("displayIcon" ) var displayIcon : String? = null,
    @SerializedName("assetPath"   ) var assetPath   : String? = null

)


data class Abilities (

    @SerializedName("slot"        ) var slot        : String? = null,
    @SerializedName("displayName" ) var displayName : String? = null,
    @SerializedName("description" ) var description : String? = null,
    @SerializedName("displayIcon" ) var displayIcon : String? = null

)



data class MediaList (

    @SerializedName("id"    ) var id    : Int?    = null,
    @SerializedName("wwise" ) var wwise : String? = null,
    @SerializedName("wave"  ) var wave  : String? = null

)


data class VoiceLine (

    @SerializedName("minDuration" ) var minDuration : Double?              = null,
    @SerializedName("maxDuration" ) var maxDuration : Double?              = null,
    @SerializedName("mediaList"   ) var mediaList   : ArrayList<MediaList> = arrayListOf()

)