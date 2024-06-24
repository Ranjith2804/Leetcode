class Solution:
    def defangIPaddr(self, ipaddress):
        return ipaddress.replace(".", "[.]")
