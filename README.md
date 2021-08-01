# Refactoring UFU

## Se refactoring é tão importante no contexto de práticas ágeis, se práticas ágeis são tão adotadas hoje em dia, por que um estudo empírico mostrou que 80% dos bad smells permanecem no código ao longo do tempo e por que refactoring é responsável por eliminar apenas 9% dos smells ?

Não é possível discutir sobre esse tema sem antes dizer a definição de
refactoring, refactoring é a estratégia de aumentar a manutenibilidade do
código alterando a sua estrutura interna do seu código sem mudar o comportamento. Essa é uma afirmação muito bonita retirada da introdução desse artigo: [Analyzing the Impact of Refactoring on Bad Smells](https://www.researchgate.net/publication/347819628_Analyzing_the_Impact_of_Refactoring_on_Bad_Smells). Sejamos honestos, nos como desenvolvedores não fazemos ideia qual é o verdadeiro
comportamento do nosso código, não nos é ensinado a provar ou usar teoremas matemáticos que garantem que nossos programas iram se comportar
como previsto, logo o ato de mudar a estrutura interna do código passasse ser __inevitavelmente perigoso__, talvez com tempo necessário que provavélmente nós __nunca__ teremos, poderíamos retirar todos os bad smells rearranjando a estrutura interna do código tornando ele mais fácil de ser mantído e digno de ser visto e cheirados pelos deuses artesãos do código. 
No entanto com as ferramentas que temos hoje você não conseguiria fazer tal
operação sem errar, sem criar um comportamento inesperado. Comportamento esse que muito provavélmente poderá tirar dinheiro do seu chefe ou tirar dinheiro do usuário que poderá tentar tirar dinheiro do seu chefe. Tirar dinheiro do seu chefe não é uma figura de linguagem, é um motivo para ser
demitido. Boa parte dos smells permanecem no código ao longo do tempo porque pessoas não querem ser demitidas. Por que uma pequena parte é eliminada ?
porque software foi construído para ser mudado e software em produção tem
a sua mudança algo inevitável. O que dá dinheiro é o software está
__funcionando__ e ser capaz de ser __mantido__ se está fedendo ou não
o importante é não ser demitido e ter saúde, Cuide-se.