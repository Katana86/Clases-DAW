﻿﻿<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
       <h2>Inventario de productos</h2>
       <xsl:for-each select="inventario/item">
        <xsl:sort select="name" order="ascending"/>
        <h1><xsl:value-of select="name"/></h1>
        <p><xsl:value-of select="brand"/><xsl:text> - </xsl:text><xsl:value-of select="category"/></p>
        <p>Precio: $<xsl:value-of select="price"/></p>
        <xsl:if test="available = string('true')">
         <p color="#30ff06">Disponible</p>
        </xsl:if>
        <xsl:if test="available = string('false')">
         <p color="#ff0606">Agotado</p>
        </xsl:if>
       </xsl:for-each>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>