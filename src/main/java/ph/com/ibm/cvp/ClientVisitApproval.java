package ph.com.ibm.cvp;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ClientVisitApproval {
	
	@Id String id;
	
	String clientVisitRequestId;
	
	List<Approval> approvalList;
	
	String updatedDate;
	
	String updatedBy;
	
	String remarks;
	

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClientVisitRequestId() {
		return clientVisitRequestId;
	}

	public void setClientVisitRequestId(String clientVisitRequestId) {
		this.clientVisitRequestId = clientVisitRequestId;
	}

	public List<Approval> getApprovalList() {
		return approvalList;
	}

	public void setApprovalList(List<Approval> approvalList) {
		this.approvalList = approvalList;
	}
	
	

}
