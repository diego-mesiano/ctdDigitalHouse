*** variables ***
${COOKIES}  css=#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll
${PACOTES}  css=#__next > div.Header_Header__1jiZz > div.hrc-2LOsj > div > div > div.h-91nvuq > div > button:nth-child(2)
${INPUT}  css=#downshift-1-input
${PESQUISAR}  css=#__next > div.Header_Header__1jiZz > div.hrc-2LOsj > div > div > div.hrc-2_yd0.hrc-3T0_Y > button
${PACOTE}  css=#__next > div > section.hrc-2LOsj.Hotels_Main__M_f2q > div.ResultsCardsContainer_ResultsCardContainer__1jtiB.ResultsCardsContainer_OrientationHorizontal__1ZjFk > a:nth-child(1) > div.hrc-2MRhP.hrc-2QmiO > div:nth-child(1) > h3
${ESCOLHEROPCAO}  css=body > div:nth-child(4) > section > div.box-offer-top.box-nopadding.col-sm-6.col-md-6 > div > section.box-offer-main.pull-left > div:nth-child(5) > div.pull-left.first-box > button
${COMPRAR}  css=#offer-options > div.offer-options--items > div:nth-child(4) > div.row.flex > div.col-xs-12.col-sm-4.col-md-4.offer-options--box-right.main-package > div > div.col-xs-12.col-sm-7.col-md-7.offer-options--box.offer-options--box-price.flex > div:nth-child(2) > div:nth-child(4) > a
${GARANTIR}  css=#dont-leave-banner > div > div > div > div.banner-package_button.dismiss.button
${BOLETOPARC}  css=#ui-id-1
${EMAIL}  css=#itxEmail
${NOME}  css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(1) > div > input
${CPF}  css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(2) > div > input
${CELULAR}  css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(3) > div > input
${SEISX}  css=#select2-installments\[\]-u1-result-tiht-6
${CONCORDO}  css=#cancellation-policy

*** keywords ***
Abrir o site do hurb
  Open Browser  http://hurb.com/br  chrome

Processo de reserva de pacote de viagens
  Click Element  ${COOKIES}
  Click Element  ${PACOTES}
  Input Text   ${INPUT} Buenos Aires
  Click Element  ${PESQUISAR}
  Click Element  ${PACOTE}
  Click Element  ${ESCOLHEROPCAO}
  Click Element  ${COMPRAR}
  Click Element  ${GARANTIR}
  Click Element  ${BOLETOPARC}
  Input Text ${NOME} Diego Mesiano
  Input Text ${CPF} 12345678910
  Input Text ${CELULAR} 19987510588
  Click Element ${SEISX}
  Click Element  ${CONCORDO}

