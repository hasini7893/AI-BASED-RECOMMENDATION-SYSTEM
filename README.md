# AI-BASED-RECOMMENDATION-SYSTEM

COMPANY:CODTECH IT SOLUTIONS

NAME:MOTHUKURI HASINI

INTERN ID::CITS0D169

DOMAIN:JAVA

DURATION:6 WEEKS

MENTOR:NEELA SANTOSH

## DESCRIPTION ##

This Java project uses the Apache Mahout machine learning library to implement an AI-based product recommendation system. Using the idea of collaborative filtering, the system is made to recommend goods or content 

to users based on their prior preferences.

Through the use of user-based collaborative filtering, the recommendation engine locates users who share interests and suggests products that these users have given high ratings. To determine how similar two users

are based on their product ratings, it uses Pearson Correlation Similarity.

The CSV file (data.csv) containing the system's data includes records in the following formats: userID, itemID, and rating. This dataset mimics user ratings of various products, films, and articlesImportant parts of the system:

User-item rating data is loaded and managed using Apache Mahout's FileDataModel.

Similarity between users is measured by PearsonCorrelationSimilarity.

For every user, NearestNUserNeighborhood determines the most similar users.

Personalized recommendations are produced using GenericUserBasedRecommender.

Based on the preferences of users who are similar to the user (e.g., user ID 1), the program suggests the top 3 products for that user. A predicted preference score that shows how appropriate the item is for the user is included in the output, along with suggested item IDs.

In accordance with the format needed for the internship deliverable, the program is packaged under Internship, with the primary class being called ai_based.

This project shows how artificial intelligence (AI) can be used in the real world to personalize content or product recommendations, which are frequently employed by websites like Amazon, Netflix.

