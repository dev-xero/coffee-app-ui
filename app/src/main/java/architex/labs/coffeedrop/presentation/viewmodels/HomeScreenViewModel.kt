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
package architex.labs.coffeedrop.presentation.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import architex.labs.coffeedrop.domain.models.sub_models.CoffeeType
import architex.labs.coffeedrop.domain.repository.CoffeeList
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor (
	val coffeeList: CoffeeList
): ViewModel() {
	var searchString: String by mutableStateOf("")
	var selectedType: CoffeeType by mutableStateOf(CoffeeType.Cappuccino)
	val coffeeTypeList: List<CoffeeType> = listOf(
		CoffeeType.Cappuccino,
		CoffeeType.Cortado,
		CoffeeType.Espresso,
		CoffeeType.DoubleEspresso,
		CoffeeType.Latte,
		CoffeeType.Mocha,
		CoffeeType.Macho
	)

	fun updateSearchString(newString: String) {
		searchString = newString
	}

}