package com.example.roomtesting.data.database

import androidx.room.Insert
import androidx.room.Query

interface TaskDao {

    @Insert
    fun insert(task: Task)

    @Query("SELECT * FROM tasks")
    fun getAllTasks(): List<Task>

}