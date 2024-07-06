/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.management.app.service.impl;

import com.liferay.portal.aop.AopService;

import com.management.app.service.base.EmployeeLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Albert Cabral
 */
@Component(
	property = "model.class.name=com.management.app.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
}