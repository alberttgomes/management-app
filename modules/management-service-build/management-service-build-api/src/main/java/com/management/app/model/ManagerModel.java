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
 * The base model interface for the Manager service. Represents a row in the &quot;Management_Manager&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.management.app.model.impl.ManagerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.management.app.model.impl.ManagerImpl</code>.
 * </p>
 *
 * @author Albert Cabral
 * @see Manager
 * @generated
 */
@ProviderType
public interface ManagerModel
	extends BaseModel<Manager>, MVCCModel, ShardedModel, StagedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a manager model instance should use the {@link Manager} interface instead.
	 */

	/**
	 * Returns the primary key of this manager.
	 *
	 * @return the primary key of this manager
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this manager.
	 *
	 * @param primaryKey the primary key of this manager
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this manager.
	 *
	 * @return the mvcc version of this manager
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this manager.
	 *
	 * @param mvccVersion the mvcc version of this manager
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the uuid of this manager.
	 *
	 * @return the uuid of this manager
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this manager.
	 *
	 * @param uuid the uuid of this manager
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the manager ID of this manager.
	 *
	 * @return the manager ID of this manager
	 */
	public long getManagerId();

	/**
	 * Sets the manager ID of this manager.
	 *
	 * @param managerId the manager ID of this manager
	 */
	public void setManagerId(long managerId);

	/**
	 * Returns the group ID of this manager.
	 *
	 * @return the group ID of this manager
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this manager.
	 *
	 * @param groupId the group ID of this manager
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this manager.
	 *
	 * @return the company ID of this manager
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this manager.
	 *
	 * @param companyId the company ID of this manager
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this manager.
	 *
	 * @return the create date of this manager
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this manager.
	 *
	 * @param createDate the create date of this manager
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this manager.
	 *
	 * @return the modified date of this manager
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this manager.
	 *
	 * @param modifiedDate the modified date of this manager
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the employee ID pk of this manager.
	 *
	 * @return the employee ID pk of this manager
	 */
	public long getEmployeeIdPK();

	/**
	 * Sets the employee ID pk of this manager.
	 *
	 * @param employeeIdPK the employee ID pk of this manager
	 */
	public void setEmployeeIdPK(long employeeIdPK);

	@Override
	public Manager cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}