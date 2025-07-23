package Internship;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import java.io.File;
import java.util.List;

public class ai_based {

    public static void main(String[] args) {
        try {
            // Load the user-item preference data
            DataModel model = new FileDataModel(new File("data.csv")); // Make sure this file is in project root

            // Calculate similarity between users
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

            // Create a neighborhood of similar users
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);

            // Create a recommender based on user similarity and neighborhood
            Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            // Recommend top 3 items for user with ID 1
            List<RecommendedItem> recommendations = recommender.recommend(1, 3);

            // Display recommended items
            System.out.println("🔮 Recommended items for user 1:");
            for (RecommendedItem item : recommendations) {
                System.out.println("➡️ Item ID: " + item.getItemID() + " | Predicted Preference: " + item.getValue());
            }

        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }
}
