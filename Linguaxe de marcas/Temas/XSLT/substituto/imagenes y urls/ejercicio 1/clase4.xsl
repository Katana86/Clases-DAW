﻿<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="clase4.xml/datos/elemento">
<html> 
  <body>
    <h2>Lista de Sitios Web Relevantes:</h2>
      <ol>
        <li><a href="{url}"><xsl:value-of select="nombre"/></a> - <xsl:value-of select="descripcion"/></li>
        <li><a href="{url}"><xsl:value-of select="nombre"/></a> - <xsl:value-of select="descripcion"/></li>
      </ol>
    </body>
</html>
</xsl:template>
</xsl:stylesheet>
