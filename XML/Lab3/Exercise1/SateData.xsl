<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/states">
        <html>
            <head>
                <Title>State Data</Title>
            </head>
            <body>
                <h1>State Data</h1>
                <table border="1">
                    <tr bgcolor = "CYAN">
                        <th>Name</th>
                        <th>Population</th>
                        <th>Capital</th>
                        <th>Bird</th>
                        <th>Flower</th>
                        <th>Area</th>
                    </tr>
                    <xsl:apply-templates/>
                </table>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="state">
        <tr>
            <td><xsl:value-of select="name"/></td>
            <td><xsl:apply-templates select="population"/></td>
            <td><xsl:apply-templates select="capital"/></td>
            <td><xsl:apply-templates select="bird"/></td>
            <td><xsl:apply-templates select="flower"/></td>
            <td><xsl:apply-templates select="area"/></td>
        </tr></xsl:template>
</xsl:stylesheet>