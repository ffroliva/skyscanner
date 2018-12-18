
# Implementation:

### Q) What libraries did you add to the frontend? What are they used for?

I used bootstrap 3.3.7 to organize the whole page's layout. Some customizations where so the page would look as close as possible with the given design. I didn't find the arrow used in the design on bootstrap's framework, so I used the arrow icon that comes bundled within it. Bootstrap doesn't have the pound sign. I've searched the internet and found a good sample of the pound sign on the fontaweme icon list. 

### Q) What is the command to start the server?

I have changed the server implementation because I was getting error when executing
`npm install` to install the server side node dependencies in my local enviroment.

I decided to rebuild the server side in spring-boot since I felt more confortable with.

Not that I would not use Express, it was just that I needed to have the job done and I wasn't with enough time to trobleshot the problem at the moment.

My local dev enviroment was set up with the latest version of node 10.14.2 and npm 6.4.0 There seems have with the server side dependencies and newest version of node and npm. to start the server side just run the following command within the server folder: `mvn spring-boot:run -Dapi.key={key}"`

P.S.: Passing the api.key is mandatory in order for the rest API to work.

# General:

### Q) How long, in hours, did you spend on the test?

10 hours, mostly on the server side.

### Q) If you had more time, what further improvements or new features would you add?

I would develop a paging functionality and a search box to select the flights, dates, passengers, etc.

### Q) Which parts are you most proud of? And why?

Rebuild the backend in Java was very nice because I could create a single rest api that wrapped both the create session the search fights api calls accordingly with what was asked for: Fetch all monday flights from EDI to LHN.

### Q) Which parts did you spend the most time with? What did you find most difficult?

The react part was the most troblesome part because I was not familiar with. I had to research how to use it what are the best practices, etc. I tried to use the backpack components, but it was counter productive. I had no idea what the component looked
 like. I would have to try it to see if that would fit my needs. I would sugest that I printscreen of the component was introduced in the README.md file of every component so the developer can have a tast of what he or she would get, not wasting time having to test to see it.

### Q) How did you find the test overall? If you have any suggestions on how we can improve the test or our API, we'd love to hear them.

I was not confortable working with the backpack react components. I would suggest, for example, that an you would attach an image of the rendered componemt in the README.md, so the developer could have of what he or she would get not wasting time
 having to test the component to see if that was what he or she were looking for.

In the overall It was very good test. I have pushed myself to learn react to deliver the task the best I could with all personal difficulties I have. I had to work after my work. My dad got sick and had to be hospitalized. I have to help him there and give support for my family. I wished I could have delievered the test earlier, but I just couldn't do it.​
