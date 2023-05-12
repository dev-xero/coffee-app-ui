/**
 * Copyright (C) [2023 - Present] - Xero
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package architex.labs.coffeedrop.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import architex.labs.coffeedrop.presentation.components.CoffeeDetailsDisplay
import architex.labs.coffeedrop.presentation.theme.Neutrals400
import architex.labs.coffeedrop.presentation.viewmodels.CoffeeDetailsScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoffeeDetailsScreen(
	modifier: Modifier = Modifier,
	viewModel: CoffeeDetailsScreenViewModel,
	onBackButtonClicked: () -> Unit
) {
	val selectedCoffee = viewModel.selectedCoffee!!

	Scaffold(
		modifier = modifier.background(Neutrals400),
		content = {contentPadding ->
			LazyColumn(modifier = Modifier.padding(contentPadding)) {
				item {
					selectedCoffee.run {
						CoffeeDetailsDisplay(
							imageResID = imageResID,
							titleRedID = name,
							variant = variant,
							ratings = rating,
							reviews = reviews,
							coffeeType = roastingLevel.roastingLevel,
							onBackButtonClicked = onBackButtonClicked
						)
					}
				}
			}
		}
	)
}