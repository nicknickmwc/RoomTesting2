package com.example.roomtesting

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.roomtesting.data.database.AppDatabase
import com.example.roomtesting.data.database.Task
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ).build()

        val task = Task(name = "task1", volOfDays = 3)

        /*lifecycleScope.launch {
            database.getDatabase(applicationContext).taskDao().insert(task)
        }*/
        db.taskDao().insert(task)

    }
}