/*
 * Copyright (c) 2021 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.bonappetit

object DishesFactory {
  val DISHES = listOf(
    Dish(
      nameRes = R.string.dish_big_breakfast_name,
      descriptionRes = R.string.dish_big_breakfast_description,
      imageRes = R.drawable.breakfast_sausage_egg_w150,
      category = Dish.Category.FOOD,
      attributes = listOf(Dish.Attribute.GlutenFree)
    ),
    Dish(
      nameRes = R.string.dish_mimosa_name,
      descriptionRes = R.string.dish_mimosa_description,
      imageRes = R.drawable.drink_champagne_glass_w150,
      category = Dish.Category.DRINK,
      attributes = listOf(Dish.Attribute.GlutenFree, Dish.Attribute.Vegetarian)
    ),
    Dish(
      nameRes = R.string.dish_coffee_name,
      descriptionRes = R.string.dish_coffee_description,
      imageRes = R.drawable.drink_coffee_cup_w150,
      category = Dish.Category.DRINK,
      attributes = listOf(Dish.Attribute.GlutenFree, Dish.Attribute.Vegetarian)
    ),
    Dish(
      nameRes = R.string.dish_mvp_breakfast_name,
      descriptionRes = R.string.dish_mvp_breakfast_description,
      imageRes = R.drawable.frying_pan_egg_w150,
      category = Dish.Category.FOOD,
      attributes = listOf(Dish.Attribute.GlutenFree)
    ),
    Dish(
      nameRes = R.string.dish_cereal_name,
      descriptionRes = R.string.dish_cereal_description,
      imageRes = R.drawable.mascot_droid_tea_cup_spoon_w150,
      category = Dish.Category.FOOD,
      attributes = listOf(Dish.Attribute.Spicy)
    ),
    Dish(
      nameRes = R.string.dish_pancakes_name,
      descriptionRes = R.string.dish_pancakes_description,
      imageRes = R.drawable.pancakes_w150,
      category = Dish.Category.FOOD,
      attributes = listOf()
    ),
    Dish(
      nameRes = R.string.dish_apple_pie_name,
      descriptionRes = R.string.dish_apple_pie_description,
      imageRes = R.drawable.pastry_w150,
      category = Dish.Category.FOOD,
      attributes = listOf(Dish.Attribute.Vegetarian)
    ),
    Dish(
      nameRes = R.string.dish_pizza_name,
      descriptionRes = R.string.dish_pizza_description,
      imageRes = R.drawable.pizza_slice_w150,
      category = Dish.Category.FOOD,
      attributes = listOf(Dish.Attribute.Spicy)
    )
  )
}