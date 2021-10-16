<#import "parts/common.ftl" as c>
<@c.page>
    Зареєстровані користувачі

    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Role</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <#list customers as customer>
            <tr>
                <td>${customer.firstname}</td>
                <td>${customer.lastname}</td>
                <td>${customer.address}</td>
                <td><#list customer.orders as order>${order?ifExists}<#sep>, </#list></td>

            </tr>
        </#list>
        </tbody>
    </table>
</@c.page>