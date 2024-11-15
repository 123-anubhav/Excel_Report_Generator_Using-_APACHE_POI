package online.experiencedeveloper.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletResponse;
import online.experiencedeveloper.report.ReportService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	public ReportService reportService;

	// Endpoint for Excel report generation
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception {

		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerVaIue = "attachment;filename=userList.xls";
		response.setHeader(headerKey, headerVaIue);

		reportService.generateExcel(response);
	}

}
