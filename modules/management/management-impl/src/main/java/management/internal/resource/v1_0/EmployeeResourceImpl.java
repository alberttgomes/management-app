package management.internal.resource.v1_0;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.pagination.Page;

import com.management.app.service.EmployeeLocalService;
import com.management.app.service.ManagerLocalService;

import java.util.ArrayList;
import javax.ws.rs.core.Response;

import management.dto.v1_0.Employee;
import management.internal.dto.v1_0.converter.constants.DTOConverterConstants;
import management.resource.v1_0.EmployeeResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Albert Cabral
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/employee.properties",
	scope = ServiceScope.PROTOTYPE, service = EmployeeResource.class
)
public class EmployeeResourceImpl extends BaseEmployeeResourceImpl {

	@Override
	public Response deleteEmployeeById(Integer employeeId) throws Exception {
		com.management.app.model.Employee employee =
				_employeeLocalService.deleteEmployee(employeeId);

		if (employee == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}

		return Response.ok().build();
	}

	@Override
	public Page<Employee> getEmployees() throws Exception {
		return Page.of(new ArrayList<>());
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) throws Exception {
		return _employeeResourceDTOConverter.toDTO(
				_employeeLocalService.fetchEmployee(employeeId));
	}

	@Override
	public Employee postEmployee(Employee employee) throws Exception {
		User user = PortalUtil.getUser(contextHttpServletRequest);

		int status = Math.toIntExact(employee.getStatus());
		int level = Math.toIntExact(employee.getLevel());

		com.management.app.model.Employee createdEmployee =
				_employeeLocalService.addEmployee(
						employee.getFirstName(), employee.getLastName(),
						employee.getDepartment(), employee.getPosition(),
						level, employee.getStateCode(), status,
						0, employee.getIsManager(), user);

		return _employeeResourceDTOConverter.toDTO(createdEmployee);
	}

	@Reference(target = DTOConverterConstants.EMPLOYEE_RESOURCE_DTO_CONVERTER)
	private DTOConverter<com.management.app.model.Employee, Employee>
			_employeeResourceDTOConverter;

	@Reference
	private ManagerLocalService _managerLocalService;

	@Reference
	private EmployeeLocalService _employeeLocalService;

}