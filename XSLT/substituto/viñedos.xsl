<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body>
  <h1>Os meus viños</h1>
  <table border="1">
   <tr bgcolor="#aabbcc">
    <th>Nome</th>
    <th>Prezo</th>
   </tr>
   <tr>
    <xsl:for-each select="viños/viño">
    <xsl:sort select="prezo" case-order="lower-first"/>
    <xsl:if test="prezo>10">
    <tr>
     <td><xsl:value-of select="nome"/></td>
     <td><xsl:value-of select="prezo"></td>
   </tr>
   </xsl:if>
   </xsl:for-each>
</body>
</html>
</xsl:template>
</xsl:stylesheet>