package com.betty.listview.data

import com.betty.listview.model.Mail

class Datasource {
    fun loadMails(): List<Mail> {
        return listOf(
            Mail("I love you", "12:34 AM", "hoang.cm462@gmail.com"),
            Mail(
                "Cupidatat voluptate do do fugiat dolore et. Sunt esse voluptate veniam consequat quis est velit est reprehenderit ea ut amet laborum. Tempor reprehenderit irure nulla excepteur culpa incididunt enim Lorem. Sint mollit consequat ullamco. Aute sit sunt esse do proident proident voluptate cupidatat velit pariatur pariatur.",
                "11:34 PM",
                "jusu@duck.com"
            ),
            Mail("Important Meeting Tomorrow", "09:15 AM", "boss@company.com"),
            Mail("Let's Grab Lunch!", "01:20 PM", "friend@example.com"),
            Mail("You've Got a New Follower", "03:45 PM", "social@network.com"),
            Mail("Coding Challenge Results", "05:55 PM", "recruitment@techco.com"),
            Mail("Vacation Itinerary", "10:10 AM", "hmmm@adventure.com"),
            Mail("Vacation Itinerary", "6:40 PM", "7kem10@adventure.com"),
            Mail("Vacation Itinerary", "1:12 PM", "huhuhu@adventure.com"),
        )
    }
}