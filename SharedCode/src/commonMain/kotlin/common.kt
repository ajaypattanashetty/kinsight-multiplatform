package com.kinsight.kinsightmultiplatform

import com.kinsight.kinsightmultiplatform.models.IdeaModel


expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Kotlin Alpha Capture Concept on ${platformName()}"
}

//expect class IdeaModelLogicDecorator (ideaModel: IdeaModel)

fun inspect(){
    //IdeaModel::class.
}