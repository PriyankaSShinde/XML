<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
 
			<head>
				<style type="text/css">
					table.table1 {
					border: 1px ;
					}
 
					td.table1 {
					border: 1px ;
					background-color: white;
					color: black;
					text-align:right;
					}
 
					th {
					background-color:red;
					color: blue;
					}
 
				</style>
			</head>
 
			<body>
				<table class="table1">
					<tr>
						<th style="width:250px">EmployeeID:</th>
						<th style="width:350px">EmployeeName:</th>
						<th style="width:250px">Salary</th>
						
					</tr>
 
					<xsl:for-each select="Company/Employee">
 
						<tr>
							<td class="table1">
								<xsl:value-of select="employeeId" />
							</td>
							<td class="table1">
								<xsl:value-of select="employeeName" />
							</td>
 
							<td class="table1">
								<xsl:value-of select="salary" />
							</td>
							
						</tr>
 
					</xsl:for-each>
				</table>
			</body>
		</html>

		
		 
		 
	</xsl:template>
</xsl:stylesheet>