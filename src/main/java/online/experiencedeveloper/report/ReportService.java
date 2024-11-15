package online.experiencedeveloper.report;

import java.io.IOException;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import online.experiencedeveloper.dao.UserInfoRepo;
import online.experiencedeveloper.model.UserInfo;

@Service
public class ReportService {

	@Autowired
	public UserInfoRepo users;

	public void generateExcel(HttpServletResponse response) throws IOException {

		List<UserInfo> usersItem = users.findAll();
		System.out.println(usersItem);

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("users-lists");
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("USERNAME");
		row.createCell(1).setCellValue("EMAILID");
		row.createCell(2).setCellValue("PASSWORD");

		int dataRowIndex = 1;
		for (UserInfo user : usersItem) {

			row = sheet.createRow(dataRowIndex);

			row.createCell(0).setCellValue(user.getUserName());
			row.createCell(1).setCellValue(user.getEmailId());
			row.createCell(2).setCellValue(user.getPassowrd());
			dataRowIndex++;
		}

		ServletOutputStream ops = response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();
	}
	
	}
