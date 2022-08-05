package com.example.shoppinglistapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.shoppinglistapp.data.db.entities.ShoppingItem

@Dao
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun add(item: ShoppingItem)

    @Delete
    fun delete(item: ShoppingItem)

    @Query(value ="SELECT*FROM shopping_items" )
    fun getAllShoppingItems():LiveData<List<ShoppingItem>>
}
