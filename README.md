# bcgdv-challenge
# General Info
1. PHP coding wise would have been much easier, but I felt it'll be easiest for this challenge as a whole to use Java
2. Application runs on port 8080 
3. Using H2 database (accessible through /h2)
4. Tables are prefilled. Add more in resources/data.sql 
5. /watches will get you available watches in the inventory 
6. /discounts will get you info about available discounts in the shop

# My Approach
I try to apply SOLID principles in my work for small or big projects. 
1. I first set up the DB and the tables needed (Watch & Discount)
2. I create an Entity, a Repo, and a Service for each of the above

At first, I approached it by calculating the price before discount and then calculating the discount depending on the repetitions of each watch in the cart. Then, I was able to figure out that it could all be refactored and after repetition is found, the price and discount could be altogether calculated in one loop through the map. Even though, both have an O(n) complexity, but the latter solution is much simpler and easily explains the function.

# Improvements
If I had more time, I would
1. Add user authentication
2. Add user input verification
3. Caching and Load balancer layers for real life project to cope with high traffic
4. A UI that would make the user experience more appealing. An image of the watch, price and possible discounts if more is purchased.
