# Hack Off - CONSULT, Team Z-axis
<p align="center">
    <image src="bloodBank/images/logo.png" width="200">
</p>

CONSULT is a responsive android application that maintains a record of blood donors and their blood groups along with requests made by people to the blood donors for emergency blood requirements.

In addition to this, we have added a General Health query related chatbot (Siemens Healthineers Problem Statement). We have first scraped through website to create the dataset and then preprocessed the data in order use it for intents and responses for the Neural Network to learn and reply accordingly.

The chatbot is first trained using [Natural Language Toolkit](https://www.nltk.org/) to understand the messages depending upon various tags and randomly choose the appropriate message to reply.
We used flask and connected it with twilio in order to receive and send messages through [Twilio](https://www.twilio.com/). The chatbot is then connected to the flask app to use the chatbot on whatsapp to reply to the user. This is done in order to use the same chatbot to reply on whatsapp as well. Hence, our chatbot works for mobile app, website as well as social media messaging apps like whatsapp and telegram on modifying. The flask app is deployed using Heroku on which post requests are made in order ot get a reply back.

## Features
Makes it easy for the recipients to look for blood donors in emergency situations,helps in making contact easily and also helps in solving health queries.
Included features are:
1. User Database
2. Authentication of user
3. Login and signup options
4. Make Requests
5. Find donors in your own city
6. Chatbot assistant for General Health Queries

### Working of the app
1. The landing page of the app gives description about the application:
    <p align="center">
    <image src="bloodBank/images/1.jpeg" width="200">
    </p>
2. The Awareness module Page:
    <p align="center">
    <image src="bloodBank/images/10.png" width="200">
    </p>
    
3. The Register page:
    <p align="center">
    <image src="bloodBank/images/2.png" width="200">
    </p>
4. The login page,used to log in to your account:
    <p align="center">
    <image src="bloodBank/images/3.png" width="200">
    </p>
5. The home page fragment, where the user can view the total donors and requests made and get submit a donor request:
    <p align="center">
    <image src="bloodBank/images/4.png" width="200">
    </p> 
6. The Request and the donor application forms where the user adds necessary details:
    <p align="center">
    <image src="bloodBank/images/5.png" width="200">
    <image src="bloodBank/images/6.png" width="200">
    </p>
7. The Explore fragments where the user can view all the donors and requests:
    <p align="center">
    <image src="bloodBank/images/7.png" width="200">
    <image src="bloodBank/images/8.png" width="200">
    </p>
8.The Chatbot Module that helps user with queries
    <p align="center">
    <image src="bloodBank/images/9.png" width="200">
    </p> 
        
#### Tools used
1. Realtime Database by firebase
2. Firebase Authentication
3. Firebase UI features
4. Android Studio IDE
5. Adobe XD for UI design
6. Blender for 3D Modelling
7. Python for Chatbot and ML models

## Python libraries used:
> * [NLTK](https://www.nltk.org/)
> * [Pytorch (torch)](https://pytorch.org/)
> * [Flask](https://flask.palletsprojects.com/en/1.1.x/)
> * [Numpy](https://numpy.org/)
> * [json](https://docs.python.org/3/library/json.html)
> * [Twilio](https://www.twilio.com/docs/libraries/python)

## Requirements:
> * Setup a twilio account
> * Deploy your flask app on Heroku and use its link in the twilio sandbox settings
