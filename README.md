# SpringBootAssessment

This is my PokeApi. With it you can create a user, search for pokemon as that user and see logs of past searches.

## Create a user:
### localhost:8080/pokeapi/users/create
format: {
   "name":"{name}",
   "memNum":"{num}"
}

## Get all users:
### localost:8082/users

**notes:**
- mostly for testing purposes, not actually accessible from the core/front-end

## Search for a pokemon:
### localhost:8080/pokeapi/user/{user's member number}/search/{search term}

**notes:**
- if the search term isn't valid, it just sends a 500 error.
- it also always does the search, even if the user's member number isn't valid.
- these are two of the main things I'd focus on changing.

## Get all searches:
### localhost:8080/pokeapi/audits

**note:** 
- in reality, shouldn't be so accessible, but this was mostly to show it could be done

## Other Notes:

I wasn't really sure how to test with optionals being involved, as you can't create an optional object to then compare to the optional return from a function

Also, the react app doesn't do anything other than a spinning pokeball.
