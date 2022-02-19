/* Insert household supporting data from Canada Census */

/* Data is separated into 6 categories based on the number of earners in the household */
/* We will only use data points with a HOUSEHOLDEARNERS.id value equal to 2 or 3 */

INSERT INTO HOUSEHOLDEARNERS VALUES (1, 'Total - Number of earners in the household');

INSERT INTO HOUSEHOLDEARNERS VALUES (2, 'No earners');

INSERT INTO HOUSEHOLDEARNERS VALUES (3, '1 earner or more');

INSERT INTO HOUSEHOLDEARNERS VALUES (4, '1 earner');

INSERT INTO HOUSEHOLDEARNERS VALUES (5, '2 earners');

INSERT INTO HOUSEHOLDEARNERS VALUES (6, '3 or more earners');


/* Data is separated into 22 categories based on the total income earned by the household */
/* We will only use data points with a TOTALINCOME.id value between 2 and 17, inclusive or equal to 22 */

INSERT INTO TOTALINCOME VALUES (1, 'Total - Total income of household');

INSERT INTO TOTALINCOME VALUES (2, 'Under $5,000');

INSERT INTO TOTALINCOME VALUES (3, '$5,000 to $9,999');

INSERT INTO TOTALINCOME VALUES (4, '$10,000 to $14,999');

INSERT INTO TOTALINCOME VALUES (5, '$15,000 to $19,999');

INSERT INTO TOTALINCOME VALUES (6, '$20,000 to $24,999');

INSERT INTO TOTALINCOME VALUES (7, '$25,000 to $29,999');

INSERT INTO TOTALINCOME VALUES (8, '$30,000 to $34,999');

INSERT INTO TOTALINCOME VALUES (9, '$35,000 to $39,999');

INSERT INTO TOTALINCOME VALUES (10, '$40,000 to $44,999');

INSERT INTO TOTALINCOME VALUES (11, '$45,000 to $49,999');

INSERT INTO TOTALINCOME VALUES (12, '$50,000 to $59,999');

INSERT INTO TOTALINCOME VALUES (13, '$60,000 to $69,999');

INSERT INTO TOTALINCOME VALUES (14, '$70,000 to $79,999');

INSERT INTO TOTALINCOME VALUES (15, '$80,000 to $89,999');

INSERT INTO TOTALINCOME VALUES (16, '$90,000 to $99,999');

INSERT INTO TOTALINCOME VALUES (17, '$100,000 and over');

INSERT INTO TOTALINCOME VALUES (18, '$100,000 to $124,999');

INSERT INTO TOTALINCOME VALUES (19, '$125,000 to $149,999');

INSERT INTO TOTALINCOME VALUES (20, '$150,000 to $199,999');

INSERT INTO TOTALINCOME VALUES (21, '$200,000 and over');

INSERT INTO TOTALINCOME VALUES (22, 'Median total income of household ($)');


/* Data is separated into 18 categories based on the number of household members in a given age range */
/* We will only use data points with a HOUSEHOLDSBYAGERANGE.id value equal to 7, 8, 9, 14, or 15 */

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (1, 'Total - Households by number of persons aged 0 to 5 years');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (2, 'None');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (3, '1 person or more');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (4, '1 person');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (5, '2 persons');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (6, '3 persons or more');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (7, 'Total - Households by number of persons aged 0 to 17 years');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (8, 'None');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (9, '1 person or more');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (10, '1 person');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (11, '2 persons');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (12, '3 persons or more');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (13, 'Total - Households by number of persons aged 65 years and over');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (14, 'None');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (15, '1 person or more');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (16, '1 person');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (17, '2 persons');

INSERT INTO HOUSEHOLDSBYAGERANGE VALUES (18, '3 persons or more');


/* Data is separated into 7 categories based on the number of members in a household */
/* We will only use data points with a HOUSEHOLDSIZE.id value equal to 2 or 3 */

INSERT INTO HOUSEHOLDSIZE VALUES (1, 'Total - Households by household size');

INSERT INTO HOUSEHOLDSIZE VALUES (2, '1 person');

INSERT INTO HOUSEHOLDSIZE VALUES (3, '2 or more persons');

INSERT INTO HOUSEHOLDSIZE VALUES (4, '2 persons');

INSERT INTO HOUSEHOLDSIZE VALUES (5, '3 persons');

INSERT INTO HOUSEHOLDSIZE VALUES (6, '4 persons');

INSERT INTO HOUSEHOLDSIZE VALUES (7, '5 or more persons');


/* Data is separated into 11 categories based on the household composition */
/* We will only use data points with a HOUSEHOLDTYPE.id value equal to 4, 7, 10, or 11 */

INSERT INTO HOUSEHOLDTYPE VALUES (1, 'Total - Household type including census family structure');

INSERT INTO HOUSEHOLDTYPE VALUES (2, 'Census family households');

INSERT INTO HOUSEHOLDTYPE VALUES (3, 'One-census-family households without additional persons');

INSERT INTO HOUSEHOLDTYPE VALUES (4, 'One couple census family without other persons in the household');

INSERT INTO HOUSEHOLDTYPE VALUES (5, 'Without children');

INSERT INTO HOUSEHOLDTYPE VALUES (6, 'With children');

INSERT INTO HOUSEHOLDTYPE VALUES (7, 'One lone-parent census family without other persons in the household');

INSERT INTO HOUSEHOLDTYPE VALUES (8, 'With a male lone parent');

INSERT INTO HOUSEHOLDTYPE VALUES (9, 'With a female lone parent');

INSERT INTO HOUSEHOLDTYPE VALUES (10, 'Other census family households');

INSERT INTO HOUSEHOLDTYPE VALUES (11, 'Non-census-family households');



