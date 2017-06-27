package ph.com.ibm.cvp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;


@PreAuthorize("hasRole('ROLE_USER')")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RepositoryRestResource(collectionResourceRel = "cvpApproval", path = "cvpApproval")
public interface ClientVisitApprovalRepository extends MongoRepository<ClientVisitApproval, String> {
	
	
}
