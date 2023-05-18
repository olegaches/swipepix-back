package com.coldwised.plugins

import com.coldwised.room.RoomController
import com.coldwised.routes.getCatalogCategories
import com.coldwised.routes.getChildCategories
import com.coldwised.routes.getProductById
import com.coldwised.routes.getProductsByCategory
import io.ktor.server.routing.*
import io.ktor.server.application.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        getCatalogCategories(roomController)
        getChildCategories(roomController)
        getProductsByCategory(roomController)
        getProductById(roomController)
    }
}
