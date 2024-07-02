package com.demo.service;

import java.util.List;

import com.demo.model.Complaint;

public interface IComplaintService {

	List<?> getAllComplaints();

	Complaint getComplaintById(int id);

	void addNewComplaint(Complaint comp, int id);

	void updateComplaint(Complaint comp);

	void deleteComplaint(int id);

	List<Complaint> getNewComplaints();

	List<Complaint> getInProcessComplaints();

	List<Complaint> getCompletedComplaints();

	void editNewStatus(Complaint cmp);

	void editInProcessStatus(Complaint cmp);

	List<Complaint> getVillageComplaints(String village);

	int getCompletedCount();

	int getInProcessCount();

	int getNewCount();

}
