package ph.com.ibm.cvp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "http://localhost")
@RepositoryRestResource(collectionResourceRel = "cvpApproval", path = "cvpApproval")
public interface ClientVisitApprovalRepository extends MongoRepository<ClientVisitApproval, String> {
	
	
}
