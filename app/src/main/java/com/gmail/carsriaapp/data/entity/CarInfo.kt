package com.gmail.carsriaapp.data.entity

import com.google.gson.annotations.SerializedName

data class CarInfo(

    @field:SerializedName("isAutoAddedByPartner")
    val isAutoAddedByPartner: Boolean? = null,

    @field:SerializedName("modelId")
    val modelId: Int? = null,

    @field:SerializedName("optionStyles")
    val optionStyles: List<Any?>? = null,

    @field:SerializedName("levelData")
    val levelData: LevelData? = null,

    @field:SerializedName("photoData")
    val photoData: PhotoData? = null,

    @field:SerializedName("plateNumberData")
    val plateNumberData: PlateNumberData? = null,

    @field:SerializedName("userBlocked")
    val userBlocked: List<Any?>? = null,

    @field:SerializedName("checkedVin")
    val checkedVin: CheckedVin? = null,

    @field:SerializedName("technicalChecked")
    val technicalChecked: Boolean? = null,

    @field:SerializedName("exchangeTypeId")
    val exchangeTypeId: Int? = null,

    @field:SerializedName("userHideADSStatus")
    val userHideADSStatus: Boolean? = null,

    @field:SerializedName("userPhoneData")
    val userPhoneData: UserPhoneData? = null,

    @field:SerializedName("EUR")
    val eUR: Int? = null,

    @field:SerializedName("oldTop")
    val oldTop: OldTop? = null,

    @field:SerializedName("videoMessageID")
    val videoMessageID: String? = null,

    @field:SerializedName("locationCityName")
    val locationCityName: String? = null,

    @field:SerializedName("realtyExchange")
    val realtyExchange: Boolean? = null,

    @field:SerializedName("moderatedAbroad")
    val moderatedAbroad: Boolean? = null,

    @field:SerializedName("canSetSpecificPhoneToAdvert")
    val canSetSpecificPhoneToAdvert: Boolean? = null,

    @field:SerializedName("modelNameEng")
    val modelNameEng: String? = null,

    @field:SerializedName("UAH")
    val uAH: Int? = null,

    @field:SerializedName("hasWebP")
    val hasWebP: Int? = null,

    @field:SerializedName("autoData")
    val autoData: AutoData? = null,

    @field:SerializedName("infoBarText")
    val infoBarText: String? = null,

    @field:SerializedName("chipsCount")
    val chipsCount: Int? = null,

    @field:SerializedName("updateDate")
    val updateDate: String? = null,

    @field:SerializedName("color")
    val color: Color? = null,

    @field:SerializedName("markId")
    val markId: Int? = null,

    @field:SerializedName("soldDate")
    val soldDate: String? = null,

    @field:SerializedName("withInfoBar")
    val withInfoBar: Boolean? = null,

    @field:SerializedName("exchangeType")
    val exchangeType: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("exchangePossible")
    val exchangePossible: Boolean? = null,

    @field:SerializedName("subCategoryName")
    val subCategoryName: String? = null,

    @field:SerializedName("secureKey")
    val secureKey: String? = null,

    @field:SerializedName("markName")
    val markName: String? = null,

    @field:SerializedName("sendComments")
    val sendComments: Int? = null,

    @field:SerializedName("cityLocative")
    val cityLocative: String? = null,

    @field:SerializedName("expireDate")
    val expireDate: String? = null,

    @field:SerializedName("autoInfoBar")
    val autoInfoBar: AutoInfoBar? = null,

    @field:SerializedName("haveInfotechReport")
    val haveInfotechReport: Boolean? = null,

    @field:SerializedName("markNameEng")
    val markNameEng: String? = null,

    @field:SerializedName("USD")
    val uSD: Int? = null,

    @field:SerializedName("videoMessages")
    val videoMessages: VideoMessages? = null,

    @field:SerializedName("plateNumber")
    val plateNumber: String? = null,

    @field:SerializedName("userId")
    val userId: Int? = null,

    @field:SerializedName("addDate")
    val addDate: String? = null,

    @field:SerializedName("badges")
    val badges: List<Any?>? = null,

    @field:SerializedName("firstTime")
    val firstTime: Boolean? = null,

    @field:SerializedName("modelName")
    val modelName: String? = null,

    @field:SerializedName("dontComment")
    val dontComment: Int? = null,

    @field:SerializedName("isLeasing")
    val isLeasing: Int? = null,

    @field:SerializedName("auctionPossible")
    val auctionPossible: Boolean? = null,

    @field:SerializedName("dealer")
    val dealer: Dealer? = null,

    @field:SerializedName("VIN")
    val vIN: String? = null,

    @field:SerializedName("partnerId")
    val partnerId: Int? = null,

    @field:SerializedName("linkToView")
    val linkToView: String? = null,

    @field:SerializedName("stateData")
    val stateData: StateData? = null
)

data class Dealer(

    @field:SerializedName("link")
    val link: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("packageId")
    val packageId: Int? = null,

    @field:SerializedName("verified")
    val verified: Boolean? = null,

    @field:SerializedName("logo")
    val logo: String? = null,

    @field:SerializedName("typeId")
    val typeId: Int? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("type")
    val type: String? = null
)

data class StateData(

    @field:SerializedName("regionNameEng")
    val regionNameEng: String? = null,

    @field:SerializedName("regionName")
    val regionName: String? = null,

    @field:SerializedName("stateId")
    val stateId: Int? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("cityId")
    val cityId: Int? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("linkToCatalog")
    val linkToCatalog: String? = null
)

data class PhotoData(

    @field:SerializedName("all")
    val all: List<Int?>? = null,

    @field:SerializedName("seoLinkM")
    val seoLinkM: String? = null,

    @field:SerializedName("count")
    val count: Int? = null,

    @field:SerializedName("seoLinkF")
    val seoLinkF: String? = null,

    @field:SerializedName("seoLinkB")
    val seoLinkB: String? = null,

    @field:SerializedName("seoLinkSX")
    val seoLinkSX: String? = null
)

data class Color(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("hex")
    val hex: String? = null,

    @field:SerializedName("eng")
    val eng: String? = null
)

data class VideoMessages(
    val any: Any? = null
)

data class OldTop(

    @field:SerializedName("expireDate")
    val expireDate: String? = null,

    @field:SerializedName("isActive")
    val isActive: Boolean? = null
)

data class AutoInfoBar(

    @field:SerializedName("abroad")
    val abroad: Boolean? = null,

    @field:SerializedName("damage")
    val damage: Boolean? = null,

    @field:SerializedName("underCredit")
    val underCredit: Boolean? = null,

    @field:SerializedName("custom")
    val custom: Boolean? = null,

    @field:SerializedName("onRepairParts")
    val onRepairParts: Boolean? = null,

    @field:SerializedName("confiscatedCar")
    val confiscatedCar: Boolean? = null
)

data class UserPhoneData(

    @field:SerializedName("phone")
    val phone: String? = null,

    @field:SerializedName("phoneId")
    val phoneId: String? = null
)

data class AutoData(

    @field:SerializedName("fuelName")
    val fuelName: String? = null,

    @field:SerializedName("categoryNameEng")
    val categoryNameEng: String? = null,

    @field:SerializedName("year")
    val year: Int? = null,

    @field:SerializedName("autoId")
    val autoId: Int? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("onModeration")
    val onModeration: Boolean? = null,

    @field:SerializedName("driveName")
    val driveName: String? = null,

    @field:SerializedName("gearBoxId")
    val gearBoxId: Int? = null,

    @field:SerializedName("mainCurrency")
    val mainCurrency: String? = null,

    @field:SerializedName("subCategoryNameEng")
    val subCategoryNameEng: String? = null,

    @field:SerializedName("bodyId")
    val bodyId: Int? = null,

    @field:SerializedName("fuelId")
    val fuelId: Int? = null,

    @field:SerializedName("race")
    val race: String? = null,

    @field:SerializedName("custom")
    val custom: Int? = null,

    @field:SerializedName("vat")
    val vat: Boolean? = null,

    @field:SerializedName("active")
    val active: Boolean? = null,

    @field:SerializedName("version")
    val version: String? = null,

    @field:SerializedName("raceInt")
    val raceInt: Int? = null,

    @field:SerializedName("driveId")
    val driveId: Int? = null,

    @field:SerializedName("statusId")
    val statusId: Int? = null,

    @field:SerializedName("fuelNameEng")
    val fuelNameEng: String? = null,

    @field:SerializedName("isSold")
    val isSold: Boolean? = null,

    @field:SerializedName("withVideo")
    val withVideo: Boolean? = null,

    @field:SerializedName("gearboxName")
    val gearboxName: String? = null,

    @field:SerializedName("fromArchive")
    val fromArchive: Boolean? = null,

    @field:SerializedName("withVideoMessages")
    val withVideoMessages: Boolean? = null,

    @field:SerializedName("categoryId")
    val categoryId: Int? = null
)

data class LevelData(

    @field:SerializedName("period")
    val period: Int? = null,

    @field:SerializedName("level")
    val level: Int? = null,

    @field:SerializedName("expireDate")
    val expireDate: String? = null,

    @field:SerializedName("label")
    val label: Int? = null,

    @field:SerializedName("hotType")
    val hotType: String? = null,

    @field:SerializedName("callsLevel")
    val callsLevel: Int? = null
)

data class PlateNumberData(

    @field:SerializedName("text")
    val text: String? = null
)

data class CheckedVin(

    @field:SerializedName("orderId")
    val orderId: Int? = null,

    @field:SerializedName("vin")
    val vin: String? = null,

    @field:SerializedName("isShow")
    val isShow: Boolean? = null
)
