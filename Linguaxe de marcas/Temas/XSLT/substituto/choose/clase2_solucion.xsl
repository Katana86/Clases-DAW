<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body>
  <h2>Iventario</h2>
  <h1>WHEN POR PRECIO</h1>
  <xsl:for-each select="inventario/producto">
   <xsl:choose>
    <xsl:when test="precio &gt; 5">
    <p>código: <xsl:value-of select="@codigo"/></p>
    <p>nombre: <xsl:value-of select="nombre"/></p>
    <p>peso: <xsl:value-of select="peso"/><xsl:text> </xsl:text><xsl:value-of select="peso/@unidad"/></p>
    <p>precio: <xsl:value-of select="precio"/> €</p>
    <p>unidades: <xsl:value-of select="unidades"/></p>
    </xsl:when>
   </xsl:choose>
</xsl:for-each>
<h1>------------------------------------------------------------------</h1>
<h1>WHEN BUSCAR POR CODIGO</h1>
<xsl:for-each select="inventario/producto">
   <xsl:choose>
   <xsl:when test="@codigo = string('P4')">
    <p>código: <xsl:value-of select="@codigo"/></p>
    <p>nombre: <xsl:value-of select="nombre"/></p>
    <p>peso: <xsl:value-of select="peso"/><xsl:text> </xsl:text><xsl:value-of select="peso/@unidad"/></p>
    <p>precio: <xsl:value-of select="precio"/> €</p>
    <p>unidades: <xsl:value-of select="unidades"/></p>
    </xsl:when>
   </xsl:choose>
</xsl:for-each>
</body>
</html>
</xsl:template>
</xsl:stylesheet>

