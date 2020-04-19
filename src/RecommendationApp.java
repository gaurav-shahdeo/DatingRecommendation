import model.User;
import service.FileInput;
import service.InputService;
import service.RecommendationService;
import service.UserService;

import java.util.List;

public class RecommendationApp {

    public static void main(String[] args) {
        InputService inputService = new FileInput("./res/input.txt");
        UserService userService = new UserService();
        RecommendationService recommendationService = new RecommendationService(userService);

        List<String> inputs = inputService.readInput();
        userService.storeUsers(inputs);

        // Dummy User to query
        User user = userService.getDummyUser();
        List<User> recommendedUsers = recommendationService.getTopRecommendations(user,2);

        System.out.println("Top 2");
        for(User recommendedUser : recommendedUsers) {
            System.out.println(recommendedUser.getName());
        }

        System.out.println("All");
        recommendedUsers = recommendationService.getAllRecommendationForUser(user);
        for(User recommendedUser : recommendedUsers) {
            System.out.println(recommendedUser.getName());
        }
    }



}
