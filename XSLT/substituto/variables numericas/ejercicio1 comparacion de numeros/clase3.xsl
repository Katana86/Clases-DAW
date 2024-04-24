<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/ejercicios">
<html> 
<body>
     <xsl:variable name="x" select="ejercicio1/num1"/>
     <xsl:variable name="y" select="ejercicio1/num2"/>
     <p>> = <xsl:value-of select="$x &gt; $y"/></p>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
