package com.wellsfargo.srca.task_management.beans;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.wellsfargo.srca.task_management.validator.ContactCenterConstraint;

/**
 * Contact Center Detail
 * @author Heta Shah
 *
 */
@ContactCenterConstraint({"callCode", "action", "isTaxpayerId", "taxpayerId"})
public class ContactCenterDetail extends ServiceRequestTask implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String callerName;
	@NotNull
	private String callerPhone;
	@NotBlank
	private String callCode;
	@NotBlank
	private String action;
	@NotBlank
	private String fullyAuthenticated;
	@NotBlank
	private String isTaxpayerId;
	private String taxpayerId;
	private String taskPriority;
	private String taskNotes;
	@NotBlank
	private String callDetails;
	
	public String getCallerName() {
		return callerName;
	}
	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}
	public String getCallerPhone() {
		return callerPhone;
	}
	public void setCallerPhone(String callerPhone) {
		this.callerPhone = callerPhone;
	}
	public String getCallCode() {
		return callCode;
	}
	public void setCallCode(String callCode) {
		this.callCode = callCode;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getFullyAuthenticated() {
		return fullyAuthenticated;
	}
	public void setFullyAuthenticated(String fullyAuthenticated) {
		this.fullyAuthenticated = fullyAuthenticated;
	}
	public String getTaxpayerId() {
		return taxpayerId;
	}
	public void setTaxpayerId(String taxpayerId) {
		this.taxpayerId = taxpayerId;
	}
	public String getTaskPriority() {
		return taskPriority;
	}
	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}
	public String getTaskNotes() {
		return taskNotes;
	}
	public void setTaskNotes(String taskNotes) {
		this.taskNotes = taskNotes;
	}
	public String getCallDetails() {
		return callDetails;
	}
	public void setCallDetails(String callDetails) {
		this.callDetails = callDetails;
	}
	public String getIsTaxpayerId() {
		return isTaxpayerId;
	}
	public void setIsTaxpayerId(String isTaxpayerId) {
		this.isTaxpayerId = isTaxpayerId;
	}

}
