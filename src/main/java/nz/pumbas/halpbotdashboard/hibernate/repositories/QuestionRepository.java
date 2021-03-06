package nz.pumbas.halpbotdashboard.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import nz.pumbas.halpbotdashboard.hibernate.models.Question;

public interface QuestionRepository extends PagingAndSortingRepository<Question, Long>,
    JpaSpecificationExecutor<Question>
{
}