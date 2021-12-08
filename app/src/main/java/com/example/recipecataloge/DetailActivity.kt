package com.example.recipecataloge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.recipecataloge.databinding.ActivityDetailBinding
import com.example.recipecataloge.data.Recipes

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val DATA_RECIPES ="data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar((binding.toolbarDetail))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val data = intent.getParcelableExtra<Recipes>(DATA_RECIPES) as Recipes

        binding.apply {
            Glide.with(applicationContext).load(data.photo).into(imgDetail)
            tvNameDetail.text = data.name
            tvCaloriesDetail.text = data.calories
            tvCarboDetail.text = data.carbo
            tvProteinDetail.text = data.protein
            tvDescription.text = data.description
            tvIngredientsDetail.text = data.ingredient
            tvDirectionDetail.text = data.instruction
        }

        setContentView(R.layout.activity_detail)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}