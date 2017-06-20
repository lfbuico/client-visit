package ph.com.ibm.cvp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "auditlog", path = "auditlog")
public interface AuditLogRepository extends MongoRepository<AuditLog, String> {
	
	
}
