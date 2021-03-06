package com.bp.dto;

import java.io.Serializable;
import java.util.Date;

public class MedicalRecordDto implements Serializable {
	private static final long serialVersionUID = 6584400352075088943L;
	protected String medicalTestName;
	protected Date medicalRecordDate;
	protected String description;
	protected String result;

	public String getMedicalTestName() {
		return medicalTestName;
system.out.println("iam dto class ");
	}

	public void setMedicalTestName(String medicalTestName) {
		this.medicalTestName = medicalTestName;
	}
system.out.println("iam setter");

	public Date getMedicalRecordDate() {
		return medicalRecordDate;
	}
system.out.println("iam getter");

	public void setMedicalRecordDate(Date medicalRecordDate) {
		this.medicalRecordDate = medicalRecordDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
