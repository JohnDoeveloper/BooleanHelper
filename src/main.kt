/**This code was written to help those struggling with boolean values on Hyperskill.
Please feel free to raise any issues in the code if such exist**/

fun main() {
    /**
    we create a boolean variable which states if the user is human and assign it to be true
     **/
    var userIsHuman = true

    /**
    this if statement evaluates if the user is a human, if the user is human (userIsHuman = true) it greets the soft creature
     **/
    if (userIsHuman) println(
        "First print:\n" +
                "Hello soft creature."
    )

    /**
    But let's say we know for a certain the user is not a human but is instead a well written bot, so we want to let the program know the user is not human.
    We can do that in two ways, either by saying userIsHuman = false or by flipping the value which we will now demonstrate
     **/

    userIsHuman = !userIsHuman

    when (userIsHuman) {
        true -> println(
            "Second print:\n" +
                    "Hello soft creature."
        )
        false -> println(
            "Second print:\n" +
                    "Tricking people is not nice mr.Botsky."
        )
    }

    /**
    Okay, but what if we only want to give candy only to people who are BOTH human AND nice
     **/

    var userIsNice = true

    if (userIsHuman && userIsHuman) println(
        "Third print:\n" +
                "Hello nice human, you get candy"
    )

    /**
    But soon we realize not all bots are bad and they deserve candy, and that we will give candy to anyone who is either human or nice
     **/

    if (userIsHuman || userIsNice) println(
        "Fourth print:\n" +
                "Hello nice user, you get candy"
    )

    /**
    But bots don't eat candy, silly human, they eat data! So we want to give humans candy and bots data
     **/

    when {
        userIsHuman && userIsNice -> println(
            "Fifth print:\n" +
                    "Hello nice human, you get candy"
        )
        !userIsHuman && userIsNice -> println(
            "Fifth print:\n" +
                    "Hello nice bot, you get data"
        )
    }

    /**
    Notice how we made the second condition evaluate !userIsHuman instead of userIsHuman?
    Well that means we have told the compiler this is evaluates to true if the user ISN'T human.  "!" doesn't just flip the value we are assigning, it also flips the evaluation condition

    Okay, maybe you are confused now. Let's try to simplify that by evaluating two if statements.

    The first statement reads "Print this statement if the user is nice"
     **/

    if (userIsNice) println(
        "Sixth print:\n"
                + "Thank you for being nice!"
    )

    /**
    The first statement reads "Print this statement if the human is NOT nice"
     **/

    if (!userIsNice) println(
        "Sixth print:\n"
                + "You should be nicer. :("
    )

}

