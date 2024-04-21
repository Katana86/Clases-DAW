<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/ejercicios">
<html> 
<body>
     <xsl:variable name="x" select="ejercicio1/num1"/>
     <xsl:variable name="y" select="ejercicio1/num2"/>
       <xsl:if test="y < x">
        <h1>EL NUMERO MAS GRANDE ES <xsl:value-of select="y"></h1>
        <p>numero=<xsl:value-of select="$y"></p>
       </xsl:if>
       <xsl:if test="$y > $x">
       <h1>EL NUMERO MAS GRANDE ES<xsl:value-of select="x"></h1>
        <p>numero=<xsl:value-of select="$x"></p>
       </xsl:if>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
