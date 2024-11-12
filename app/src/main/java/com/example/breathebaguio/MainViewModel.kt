package com.example.breathebaguio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.breathebaguio.R.*

class MainViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    private val placeData = mapOf(
        "Kid-Friendly Places" to listOf(
            Place("Baguio Botanical Garden", drawable.botanical, "Kid-Friendly Places", "A large garden with trails and picnic areas, ideal for family outings.  ", "Location: Leonard Wood Road, Baguio City"),
            Place("Bencab Museum", drawable.bencab, "Kid-Friendly Places", "Art museum with gardens, a pond, and a space for children to explore.  ", "Location: Km 6 Asin Rd  "),
            Place("Skyranch", drawable.skyranch, "Kid-Friendly Places", "Sky Ranch is a family-friendly amusement park located near SM City Baguio. It features a Ferris wheel, drop tower, carousel, and other rides that both kids and adults can enjoy. Its elevated location offers scenic views of the mountains and city, making it a popular spot for taking photos. The park’s vibrant atmosphere and mix of thrilling and gentle rides make it an ideal place for families.", "Location: Luneta Hill, Upper Session Road (beside SM City Baguio), Baguio City"),

        ),

        "Parks" to listOf(
            Place("Wright Park", drawable.wright_park, "Parks", "Known for its horseback riding and picturesque scenery.  ", "Location: Gibraltar Road, Baguio City"),
            Place("Burnham Park", drawable.burnham, "Parks", "A popular spot with boating, biking, and playgrounds for relaxation and family activities.  ", "Location: Jose Abad Santos Dr "),
            Place("Tree Top Adventure", drawable.tree_top_adventure, "Parks", "Tree Top Adventure offers thrilling outdoor experiences and eco-friendly rides set amidst the lush pine trees of Camp John Hay. Activities include ziplining, tree drops, canopy rides, and trekking. It’s a popular destination for adventure seekers and families looking for an exciting day in nature, and safety measures are in place for all activities.", "Location: Camp John Hay, Loakan Rd, Baguio City"),

        ),

        "Restaurants" to listOf(
            Place("Good Taste", drawable.good_taste, "Restaurants", "Known for affordable prices and generous portions of Filipino and Chinese dishes.", "Location: Carino St, Baguio City, Benguet"),
            Place("Oh My Gulay", drawable.oh_my_gulay, "Restaurants", "This artistic vegetarian café and restaurant offers an eclectic interior filled with sculptures, paintings, and art installations. The menu features delicious and creative vegetarian dishes that are popular among locals and tourists alike.", "Location: 5th Floor, La Azotea Building, Session Road, Baguio City"),
            Place("Lemon & Olives Greek Taverna", drawable.lemon_and_olives_greek_tavern, "Restaurants", "Lemon and Olives is Baguio’s first authentic Greek restaurant, offering a cozy, Mediterranean-inspired setting with a lovely view of the pine trees and mountains. Known for its fresh ingredients and homemade recipes, Lemon and Olives serves a range of Greek dishes like gyros, moussaka, and souvlaki, as well as a selection of refreshing desserts. It’s an ideal spot for both casual dining and special occasions.", "Location: 26 Outlook Dr S, Baguio City"),
            Place("Hill Station", drawable.hill_station, "Restaurants", "Located in a heritage building, Hill Station serves a fusion of Western, Asian, and Filipino cuisines. With its classy, warm interior, it’s perfect for a family meal. Their mountain rice dishes and Spanish chorizo pasta are highly recommended.", "Location: Casa Vallejo, Upper Session Rd, Baguio City"),
            Place("Amare la Cucina", drawable.amare_la_cucina, "Restaurants", "Amare La Cucina is a beloved Italian restaurant in Baguio, renowned for its wood-fired pizzas, handmade pasta, and authentic Italian flavors. The restaurant offers a rustic ambiance and allows guests to try their hand at making their own pizza, which is a fun activity for families. Signature dishes include the truffle pasta and the Margherita pizza, cooked in their brick oven.", "Location: Albergo Hotel, Villamor Dr, Baguio City")
        ),


        "Buffet Style Food" to listOf(
            Place("Hodori Korean & Japanese Restaurant", drawable.hodori, "Buffet Style Food", "Offers an unlimited samgyupsal buffet with Korean and Japanese dishes.  ", "Location: Leonard Wood Rd  "),
            Place("Forest House Bistro and Cafe  ", drawable.forest_house, "Buffet Style Food", "Serves a buffet with a mix of Filipino and Western dishes and has a cozy cabin atmosphere.", "Location: 16 Loakan Rd  "),
            Place("Le Chef Buffet", drawable.le_chef_buffet, "Buffet Style Food", "Located in the prestigious Manor Hotel at Camp John Hay, Le Chef offers a luxurious buffet featuring a mix of local and international dishes. The buffet includes gourmet salads, freshly baked bread, pastas, seafood, and an array of desserts, all made with fresh ingredients. The ambiance is elegant and cozy, with views of lush pine trees, making it perfect for a special dining experience.", "Location: The Manor, Camp John Hay, Baguio City"),
            Place("Kamayan sa Baguio", drawable.kamayan_sa_baguio, "Buffet Style Food", "Kamayan sa Baguio is a Filipino restaurant known for its traditional kamayan-style (eating with hands) dining experience, offering authentic Filipino flavors in a rustic, relaxed setting. The restaurant serves a wide range of Filipino dishes, including lechon kawali, sinigang, bulalo, and grilled seafood. The ambiance is homey and family-friendly, with bamboo decor and a cozy, open-air dining area that showcases Baguio's natural beauty. The restaurant is popular for its \"boodle fight\" feasts, where a variety of food is spread across banana leaves for a shared dining experience.", "Location: 133 Scout Barrio, Baguio City (near Camp John Hay)"),
        ),


        "Coffee Shops" to listOf(
            Place("Arca's Yard", drawable.arcas_yard, "Coffee Shops", "A cozy café with art displays, books, and a view of the Cordillera mountains. A cultural haven offering coffee, books, art, and a panoramic view of the Cordillera mountains. Arca's Yard also features a small museum showcasing Igorot artifacts. ", "Location: 777 Tiptop City Limit, Ambuklao Road"),
            Place("Cafe by the Ruins", drawable.cafebytheruins, "Coffee Shops", "This rustic café is a favorite for its local blend of coffee, freshly baked bread, and traditional Filipino snacks. Its ambiance is complemented by the surrounding greenery and artistic decor. Known for its unique blend of local coffee and traditional snacks, with a rustic ambiance. ", "Location: 25 Shuntug Rd  "),
            Place("Vanilla Cafe", drawable.vanilla_cafe, "Coffee Shops", "Set within Kamiseta Hotel, this vintage-inspired café is known for its picturesque interiors and delicious pastries, making it an ideal place for Instagram photos. ", "Location: 20 Villamor Drive, Lualhati  "),
            Place("Kaffeeklatsch", drawable.kaffeeklatsch, "Coffee Shops", "A popular hangout among locals for live music and art events, serving hearty coffee blends in a cozy, artsy atmosphere.", "Location: 39 City Camp Rd"),
            Place("Beans Talk Bistro", drawable.bean_talk_bistro, "Coffee Shops", "Located in the heart of Session Road, Beans Talk serves an extensive range of coffee drinks, cakes, and light meals with a welcoming ambiance.", "Location: Porta Vaga Mall, Session Rd")

        )



    )


    fun loadPlaces(category: String) {
        _places.value = placeData[category] ?: emptyList()
    }

}