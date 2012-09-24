/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.timesheet.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portlet.timesheet.service.http.TimesheetTaskServiceSoap}.
 *
 * @author    Mate Thurzo
 * @see       com.liferay.portlet.timesheet.service.http.TimesheetTaskServiceSoap
 * @generated
 */
public class TimesheetTaskSoap implements Serializable {
	public static TimesheetTaskSoap toSoapModel(TimesheetTask model) {
		TimesheetTaskSoap soapModel = new TimesheetTaskSoap();

		soapModel.setTaskId(model.getTaskId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAssetCategoryId(model.getAssetCategoryId());
		soapModel.setAssetTagId(model.getAssetTagId());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static TimesheetTaskSoap[] toSoapModels(TimesheetTask[] models) {
		TimesheetTaskSoap[] soapModels = new TimesheetTaskSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TimesheetTaskSoap[][] toSoapModels(TimesheetTask[][] models) {
		TimesheetTaskSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TimesheetTaskSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TimesheetTaskSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TimesheetTaskSoap[] toSoapModels(List<TimesheetTask> models) {
		List<TimesheetTaskSoap> soapModels = new ArrayList<TimesheetTaskSoap>(models.size());

		for (TimesheetTask model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TimesheetTaskSoap[soapModels.size()]);
	}

	public TimesheetTaskSoap() {
	}

	public long getPrimaryKey() {
		return _taskId;
	}

	public void setPrimaryKey(long pk) {
		setTaskId(pk);
	}

	public long getTaskId() {
		return _taskId;
	}

	public void setTaskId(long taskId) {
		_taskId = taskId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getAssetCategoryId() {
		return _assetCategoryId;
	}

	public void setAssetCategoryId(long assetCategoryId) {
		_assetCategoryId = assetCategoryId;
	}

	public long getAssetTagId() {
		return _assetTagId;
	}

	public void setAssetTagId(long assetTagId) {
		_assetTagId = assetTagId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _taskId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _assetCategoryId;
	private long _assetTagId;
	private String _name;
}