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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MenuItem(
  dish: Dish,
  onDishSelected: (Dish) -> Unit,
  modifier: Modifier = Modifier
) {
  // Semantics Modifier
  val semanticsModifier = Modifier

  // Clickable modifier
  val clickableModifier = Modifier

  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = modifier
      .fillMaxWidth()
      .padding(horizontal = 16.dp, vertical = 8.dp)
      .background(
        color = if (dish.selected) {
          colorPrimary.copy(alpha = 0.1f)
        } else {
          Color.LightGray.copy(alpha = 0.2f)
        },
        shape = CutCornerShape(topEnd = 12.dp)
      )
      .padding(12.dp)
      .then(semanticsModifier)
      .then(clickableModifier)
  ) {

    DishImage(dish)

    Spacer(Modifier.width(8.dp))

    DishDescription(dish)

    Spacer(Modifier.width(8.dp))

    AddOrRemoveIcon(dish)
  }
}

@Composable
private fun DishImage(dish: Dish) {
  Image(
    painter = painterResource(dish.imageRes),
    contentDescription = "Image",
    modifier = Modifier.size(42.dp)
  )
}

@Composable
private fun RowScope.DishDescription(dish: Dish) {
  Column(Modifier.Companion.weight(1f)) {
    Text(
      text = stringResource(dish.nameRes),
      fontWeight = FontWeight.Bold
    )
    Text(
      text = stringResource(dish.descriptionRes),
    )

    Spacer(modifier = Modifier.height(4.dp))

    DishAttributes(dish.attributes)
  }
}

@Composable
private fun AddOrRemoveIcon(dish: Dish) {
  if (dish.selected) {
    Icon(
      imageVector = Icons.Filled.Check,
      contentDescription = "State",
      tint = colorPrimary
    )
  } else {
    Icon(
      imageVector = Icons.Filled.Add,
      contentDescription = "State",
      tint = colorPrimary
    )
  }
}

@Preview(showBackground = true)
@Composable
private fun MenuItemPreview() {
  MenuItem(
    dish = Dish(
      nameRes = R.string.dish_big_breakfast_name,
      descriptionRes = R.string.dish_big_breakfast_description,
      imageRes = R.drawable.breakfast_sausage_egg_w150,
      category = Dish.Category.FOOD,
      attributes = listOf(Dish.Attribute.GlutenFree)
    ),
    {}
  )
}

@Preview(showBackground = true)
@Composable
private fun MenuItemPreviewSelected() {
  MenuItem(
    dish = Dish(
      nameRes = R.string.dish_big_breakfast_name,
      descriptionRes = R.string.dish_big_breakfast_description,
      imageRes = R.drawable.breakfast_sausage_egg_w150,
      category = Dish.Category.FOOD,
      attributes = listOf(Dish.Attribute.GlutenFree),
      selected = true
    ),
    {}
  )
}
