package backend.data;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AchievementRepository extends MongoRepository<Achievement, String> {
}