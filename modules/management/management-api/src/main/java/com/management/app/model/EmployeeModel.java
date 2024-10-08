/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.management.app.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;Management_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.management.app.model.impl.EmployeeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.management.app.model.impl.EmployeeImpl</code>.
 * </p>
 *
 * @author Albert Cabral
 * @see Employee
 * @generated
 */
@ProviderType
public interface EmployeeModel
	extends BaseModel<Employee>, MVCCModel, ShardedModel, StagedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this employee.
	 *
	 * @return the mvcc version of this employee
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this employee.
	 *
	 * @param mvccVersion the mvcc version of this employee
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the uuid of this employee.
	 *
	 * @return the uuid of this employee
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this employee.
	 *
	 * @param uuid the uuid of this employee
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the employee ID of this employee.
	 *
	 * @return the employee ID of this employee
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this employee.
	 *
	 * @param employeeId the employee ID of this employee
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the group ID of this employee.
	 *
	 * @return the group ID of this employee
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this employee.
	 *
	 * @param groupId the group ID of this employee
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this employee.
	 *
	 * @return the company ID of this employee
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this employee.
	 *
	 * @param companyId the company ID of this employee
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this employee.
	 *
	 * @return the create date of this employee
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this employee.
	 *
	 * @param createDate the create date of this employee
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this employee.
	 *
	 * @return the modified date of this employee
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this employee.
	 *
	 * @param modifiedDate the modified date of this employee
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the department of this employee.
	 *
	 * @return the department of this employee
	 */
	@AutoEscape
	public String getDepartment();

	/**
	 * Sets the department of this employee.
	 *
	 * @param department the department of this employee
	 */
	public void setDepartment(String department);

	/**
	 * Returns the first name of this employee.
	 *
	 * @return the first name of this employee
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this employee.
	 *
	 * @param firstName the first name of this employee
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this employee.
	 *
	 * @return the last name of this employee
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this employee.
	 *
	 * @param lastName the last name of this employee
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the position of this employee.
	 *
	 * @return the position of this employee
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this employee.
	 *
	 * @param position the position of this employee
	 */
	public void setPosition(String position);

	/**
	 * Returns the is manager of this employee.
	 *
	 * @return the is manager of this employee
	 */
	public boolean getIsManager();

	/**
	 * Returns <code>true</code> if this employee is is manager.
	 *
	 * @return <code>true</code> if this employee is is manager; <code>false</code> otherwise
	 */
	public boolean isIsManager();

	/**
	 * Sets whether this employee is is manager.
	 *
	 * @param isManager the is manager of this employee
	 */
	public void setIsManager(boolean isManager);

	/**
	 * Returns the level of this employee.
	 *
	 * @return the level of this employee
	 */
	public int getLevel();

	/**
	 * Sets the level of this employee.
	 *
	 * @param level the level of this employee
	 */
	public void setLevel(int level);

	/**
	 * Returns the manager ID fk of this employee.
	 *
	 * @return the manager ID fk of this employee
	 */
	public long getManagerIdFK();

	/**
	 * Sets the manager ID fk of this employee.
	 *
	 * @param managerIdFK the manager ID fk of this employee
	 */
	public void setManagerIdFK(long managerIdFK);

	/**
	 * Returns the state code of this employee.
	 *
	 * @return the state code of this employee
	 */
	@AutoEscape
	public String getStateCode();

	/**
	 * Sets the state code of this employee.
	 *
	 * @param stateCode the state code of this employee
	 */
	public void setStateCode(String stateCode);

	/**
	 * Returns the status of this employee.
	 *
	 * @return the status of this employee
	 */
	public int getStatus();

	/**
	 * Sets the status of this employee.
	 *
	 * @param status the status of this employee
	 */
	public void setStatus(int status);

	/**
	 * Returns the user ID of this employee.
	 *
	 * @return the user ID of this employee
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this employee.
	 *
	 * @param userId the user ID of this employee
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this employee.
	 *
	 * @return the user uuid of this employee
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this employee.
	 *
	 * @param userUuid the user uuid of this employee
	 */
	public void setUserUuid(String userUuid);

	@Override
	public Employee cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}